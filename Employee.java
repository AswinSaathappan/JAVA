import java.sql.*;

public class Employee {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/Company"; // Database URL
        String user = "root"; // Your MySQL username
        String password = "aswin@05"; // Your MySQL password

        try {
            

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // CREATE: Add a new user
            String createSql = "INSERT INTO Employee VALUES ('Alice', 1),('ASWIN', 2)";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createSql);
            System.out.println("User added!");

            // READ: Display all users
            String readSql = "SELECT * FROM Employee";
            ResultSet rs = stmt.executeQuery(readSql);
            System.out.println("Users in the database:");
            while (rs.next()) {
                System.out.println("NAME: " + rs.getString("name") + ", ID: " + rs.getInt("id"));
            }

            // UPDATE: Change user details
            String updateSql = "UPDATE Employee SET name = 'Bob' WHERE id = 1";
            stmt.executeUpdate(updateSql);
            System.out.println("User updated!");

            // DELETE: Remove a user
            String deleteSql = "DELETE FROM Employee WHERE id = 2";
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
