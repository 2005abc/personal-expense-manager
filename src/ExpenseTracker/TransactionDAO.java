package ExpenseTracker;
import java.sql.*;
import java.util.*;

public class TransactionDAO {

    // Add new transaction
    public void addTransaction(Transaction t) {
        String sql = "INSERT INTO transactions (type, category, amount, date, description) VALUES (?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, t.getType());
            ps.setString(2, t.getCategory());
            ps.setDouble(3, t.getAmount());
            ps.setString(4, t.getDate());
            ps.setString(5, t.getDescription());
            ps.executeUpdate();
            System.out.println("Transaction added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View all transactions
    public void viewTransactions() {
        String sql = "SELECT * FROM transactions";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("type") + " | " +
                        rs.getString("category") + " | " + rs.getDouble("amount") + " | " +
                        rs.getDate("date") + " | " + rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get balance
    public void showBalance() {
        String incomeSql = "SELECT SUM(amount) FROM transactions WHERE type='INCOME'";
        String expenseSql = "SELECT SUM(amount) FROM transactions WHERE type='EXPENSE'";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement()) {

            ResultSet rs1 = st.executeQuery(incomeSql);
            double income = 0, expense = 0;
            if (rs1.next()) income = rs1.getDouble(1);

            ResultSet rs2 = st.executeQuery(expenseSql);
            if (rs2.next()) expense = rs2.getDouble(1);

            System.out.println("Total Balance = " + (income - expense));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
