import java.sql.*;
import java.util.Scanner;
class Library
{
  public static void main(String args[])throws SQLException
  {
    String url = "jdbc:mysql://localhost:3306/Library";
    String name = "root";
    String pass = "aswin@05";        
        try(Connection con = DriverManager.getConnection(url,name,pass))
        {
          System.out.println("Database created successfully");
          Scanner input = new Scanner(System.in);
          String create = "CREATE TABLE library(name VARCHAR(50))";
          try(PreparedStatement ps = con.prepareStatement(create))
          {
            ps.executeUpdate();
            System.out.println("Table created Successfully");
           }
      
         for(int i = 1; i<=2; i++)
         {
          System.out.println("Enter name:");
          String name1 = input.nextLine();
          String insert = "INSERT INTO library(name) VALUES(?)";
          try(PreparedStatement p = con.prepareStatement(insert))
          {
            p.setString(1,name1);
            p.executeUpdate();
          }
         }

          System.out.println("Enter name to be updated:");
          String name2 = input.nextLine();
          System.out.println("Enter name:");
          String name3 = input.nextLine();
          String update = "UPDATE library SET name=? WHERE name=?"; 
          try(PreparedStatement q = con.prepareStatement(update))
          {
            q.setString(1,name3);
            q.setString(2, name2);
            q.executeUpdate(); 
          }

          String read = "SELECT * FROM library";
          try(Statement s = con.createStatement())
          {
            ResultSet rs = s.executeQuery(read);
            while(rs.next())
            {
              System.out.println("Name:"+rs.getString("name"));
            }
          }
         
         }
         catch(SQLException e)
         {
            	System.out.println(e.getMessage());
         }
    }
}
          
          
  