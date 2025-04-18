import java.sql.*;
import java.io.*;
import java.security.SecureRandom;
import java.util.Random;

public class VulnerableDemo {

    // Hardcoded secret
    private static final String AWS_SECRET_KEY = "AKIAIOSFODNN7EXAMPLE";

    // Weak random number for session ID
    public String generateSessionID() {
        Random random = new Random(); // weak
        int id = random.nextInt(99999);
        return "SID-" + id;
    }

    // SQL Injection vulnerability
    public void login(String username, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Welcome back " + username);
            } else {
                System.out.println("Login failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Command Injection vulnerability
    public void runBackup(String filename) {
        try {
            String command = "tar -czf /backups/" + filename + ".tar.gz /data";
            Process p = Runtime.getRuntime().exec(command); // vulnerable
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Sensitive logging
    public void processPayment(String creditCardNumber, String cvv) {
        System.out.println("Processing card: " + creditCardNumber + " CVV: " + cvv); // sensitive info in logs
    }

    // Main method to simulate actions
    public static void main(String[] args) {
        VulnerableDemo app = new VulnerableDemo();

        // Simulate vulnerabilities
        app.login("admin' --", "irrelevant");
        app.runBackup("backup; rm -rf /");
        System.out.println("Session: " + app.generateSessionID());
        app.processPayment("4111111111111111", "123");
    }
}
