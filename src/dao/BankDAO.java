package dao;
import model.Account;
import util.DBConnection;
import java.sql.*;

public class BankDAO {

    public void createAccount(Account acc) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO accounts VALUES (?, ?, ?)");
        ps.setInt(1, acc.getAccNo());
        ps.setString(2, acc.getName());
        ps.setDouble(3, acc.getBalance());
        ps.executeUpdate();
        con.close();
    }

    public void deposit(int accNo, double amount) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE acc_no = ?");
        ps.setDouble(1, amount);
        ps.setInt(2, accNo);
        ps.executeUpdate();
        con.close();
    }

    public void withdraw(int accNo, double amount) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT balance FROM accounts WHERE acc_no = ?");
        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();
        if (rs.next() && rs.getDouble(1) >= amount) {
            ps = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE acc_no = ?");
            ps.setDouble(1, amount);
            ps.setInt(2, accNo);
            ps.executeUpdate();
            System.out.println("✅ Withdrawal successful!");
        } else {
            System.out.println("❌ Insufficient balance.");
        }
        con.close();
    }

    public void checkBalance(int accNo) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT balance FROM accounts WHERE acc_no = ?");
        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("✅ Balance: ₹" + rs.getDouble(1));
        } else {
            System.out.println("❌ Account not found.");
        }
        con.close();
    }
}