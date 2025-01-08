import java.sql.*;

public class SimpleJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Database URL
        String user = "root"; // Your MySQL username
        String password = "aswin@05"; // Your MySQL password

        try {

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // CREATE: Add a new user
            String createSql = "INSERT INTO users (name, email) VALUES ('Alice', 'alice@example.com'),('ASWIN', 'aswin@example.com')";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createSql);
            System.out.println("User added!");

            // READ: Display all users
            String readSql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(readSql);
            System.out.println("Users in the database:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // UPDATE: Change user details
            String updateSql = "UPDATE users SET name = 'Bob', email = 'bob@example.com' WHERE id = 1";
            stmt.executeUpdate(updateSql);
            System.out.println("User updated!");

            // DELETE: Remove a user
            String deleteSql = "DELETE FROM users WHERE id = 1 AND name ='Alice' AND email = 'alice@example.com'";
            stmt.executeUpdate(deleteSql);
            System.out.println("User deleted!");

            // Close the connection
            conn.close();
            System.out.println("Connection closed.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
