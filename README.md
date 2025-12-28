<h1 align="center">💰 Personal Expense Manager</h1>
<p align="center">
  A Java + MySQL based application to track, manage, and analyze personal expenses
</p>

<hr>

<h2>📌 Project Overview</h2>
<p>
Personal Expense Manager is a simple yet practical application developed using
<b>Core Java</b> and <b>MySQL</b> that helps users record their daily expenses,
categorize them, and monitor total spending for better financial control.
</p>

<h2>🚀 Features</h2>
<ul>
  <li>Add, edit, and delete daily expenses</li>
  <li>Organize expenses by categories (Food, Travel, Shopping, etc.)</li>
  <li>View total expense summary in real time</li>
  <li>Persistent data storage using MySQL</li>
</ul>

<h2>🛠️ Tech Stack</h2>
<ul>
  <li><b>Backend:</b> Java (JDBC)</li>
  <li><b>Database:</b> MySQL</li>
  <li><b>IDE:</b> IntelliJ IDEA</li>
</ul>

<h2>📁 Project Structure</h2>

<pre>
PersonalExpenseManager/
│
├── src/
│   └── ExpenseTracker/
│       ├── Transaction.java
│       ├── ExpenseTracker.java
│       ├── TransactionDAO.java
│       └── DBConnection.java
│
├── .gitignore
├── PersonalExpenseManager.iml
└── README.md
</pre>

<h2>⚙️ How It Works</h2>
<ol>
  <li>User adds expense details (amount, category, date, description)</li>
  <li>Application processes input via Java console</li>
  <li>Data is stored and retrieved using JDBC</li>
  <li>Total expense summary is calculated dynamically</li>
</ol>

<h2>🗄️ Database Schema (Sample)</h2>

<pre>
CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    amount DOUBLE NOT NULL,
    category VARCHAR(50),
    description VARCHAR(100),
    expense_date DATE
);
</pre>

<h2>▶️ How to Run</h2>
<ol>
  <li>Clone the repository</li>
  <li>Open the project in IntelliJ IDEA</li>
  <li>Add MySQL JDBC connector</li>
  <li>Configure database credentials in <code>DBConnection.java</code></li>
  <li>Run <code>Main.java</code></li>
</ol>
