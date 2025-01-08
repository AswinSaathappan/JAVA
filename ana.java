import java.sql.*;
class ana
{
   public static void main(String args[])
   {
     String url = "jdbc:mysql://localhost:3306/Admin";
     String user = "root";
     String pass = "aswin@05";
     try
     {
        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connected to database.");
        
        //CREATE
        String csql = "INSERT INTO Student VALUES ('Aswin',2023503507,'m'),('Aditya',2023503509,'m')";
        Statement smt = con.createStatement();
        smt.executeUpdate(csql);
        System.out.println("User added.");
        
        //READ
        String rsql = "SELECT *FROM Student ";
        ResultSet rs = smt.executeQuery(rsql);
        System.out.println("Users in the database:");
        while(rs.next())
        {
          System.out.println("NAME:"+rs.getString("name")+",REGNO:"+rs.getInt("reg")+",SEX:"+rs.getString("sex"));
        }
 
         //UPDATE
        String usql = "UPDATE student SET name = 'Pranesh' WHERE reg = 2023503509";
        smt.executeUpdate(usql);
        System.out.println("User updated!");

        //READ
        String Rsql = "SELECT *FROM Student ";
        ResultSet RS = smt.executeQuery(Rsql);
        System.out.println("Users in the database:");
        while(RS.next())
        {
          System.out.println("NAME:"+RS.getString("name")+",REGNO:"+RS.getInt("reg")+",SEX:"+RS.getString("sex"));
        }


        //DELETE
        String dsql = "DELETE FROM student  WHERE reg = 2023503507";
        smt.executeUpdate(dsql);
        System.out.println("User deleted!");


        //close the connection
        con.close();
        System.out.println("Connection closed."); 
       }
 
       catch(Exception e)
       {
          System.out.println(e.getMessage());
       }
}
}