import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize the database connection details
        String jdbcUrl = "jdbc:oracle:thin:@34.56.19.203:1521:xe";
        String username = "SYS as SYSDBA";
        String password = "ORACLE";

        // Test the connection
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connection successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}