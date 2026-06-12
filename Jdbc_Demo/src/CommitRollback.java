import java.sql.*;
import java.util.Scanner;

public class CommitRollback {


    private static final String url = "jdbc:mysql://localhost:3306/lenden";
    private static final String username = "root";
    private static final String password = "Password";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            con.setAutoCommit(false); // 🔥 start transaction

            String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement debitPS = con.prepareStatement(debit_query);
            PreparedStatement creditPS = con.prepareStatement(credit_query);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            int sender = 101;
            int receiver = 102;

            if (isSufficient(con, sender, amount)) {

                debitPS.setDouble(1, amount);
                debitPS.setInt(2, sender);

                creditPS.setDouble(1, amount);
                creditPS.setInt(2, receiver);

                int row1 = debitPS.executeUpdate();
                int row2 = creditPS.executeUpdate();

                if (row1 > 0 && row2 > 0) {
                    con.commit(); // ✅ success
                    System.out.println("Transaction successful");
                } else {
                    con.rollback(); // ❌ failure
                    System.out.println("Transaction failed");
                }

            } else {
                System.out.println("Insufficient balance");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isSufficient(Connection con, int account_number, double amount) {

        try {
            String query = "SELECT balance FROM accounts WHERE account_number = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, account_number);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double current_balance = rs.getDouble("balance");
                return current_balance >= amount;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }


}
