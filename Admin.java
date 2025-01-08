import java.sql.*;
import java.util.Scanner;

class Admin
 {
    public static void main(String[] args) 
      {
        String url = "jdbc:mysql://localhost:3306/gsp";
        String username = "root";
        String password = "aswin@05";

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection Established Successfully");
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert Record");
                System.out.println("2. Retrieve Records");
                System.out.println("3. Update Record");
                System.out.println("4. Delete Record");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter Roll Number: ");
                        int rollno = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = scan.nextLine();

                        String insertQuery = "INSERT INTO s (name, rollno, dept) VALUES (?, ?, ?)";
                        try (PreparedStatement ps = con.prepareStatement(insertQuery)) {
                            ps.setString(1, name);
                            ps.setString(3, dept);
                            ps.setInt(2, rollno);
                            int rowsInserted = ps.executeUpdate();
                            System.out.println(rowsInserted > 0 ? "Record inserted successfully" : "Insertion failed");
                        }
                        break;

                    case 2:
                        String selectQuery = "SELECT * FROM s";
                        try (Statement s = con.createStatement();
                             ResultSet resultSet = s.executeQuery(selectQuery)) {
                            while (resultSet.next()) {
                                System.out.println("Name: " + resultSet.getString("name"));
                                System.out.println("Roll No: " + resultSet.getInt("rollno"));
                                System.out.println("Department: " + resultSet.getString("dept"));
                                System.out.println("-------------------------------");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter Roll Number to Update: ");
                        int updRollNo = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scan.nextLine();
                        System.out.print("Enter New Department: ");
                        String newDept = scan.nextLine();

                        String updateQuery = "UPDATE s SET name = ?, dept = ? WHERE rollno = ?";
                        try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
                            ps.setString(1, newName);
                            ps.setString(2, newDept);
                            ps.setInt(3, updRollNo);
                            int rowsUpdated = ps.executeUpdate();
                            System.out.println(rowsUpdated > 0 ? "Record updated successfully" : "Update failed");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Roll Number to Delete: ");
                        int delRollNo = scan.nextInt();

                        String deleteQuery = "DELETE FROM s WHERE rollno = ?";
                        try (PreparedStatement ps = con.prepareStatement(deleteQuery)) {
                            ps.setInt(1, delRollNo);
                            int rowsDeleted = ps.executeUpdate();
                            System.out.println(rowsDeleted > 0 ? "Record deleted successfully" : "Deletion failed");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting program...");
                        scan.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}