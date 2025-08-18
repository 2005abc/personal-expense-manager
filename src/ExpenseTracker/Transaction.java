package ExpenseTracker;

public class Transaction {
    private int id;
    private String type;
    private String category;
    private double amount;
    private String date;
    private String description;

    // constructor
    public Transaction(String type, String category, double amount, String date, String description) {
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    // --- Getters ---
    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    // Optional setter for ID (if you want to use it later)
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
