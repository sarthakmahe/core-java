import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;
public class CRUD_Prepared {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static String username = "root";
    private static String password = "Password";

    public static void main(String[] args) {
        System.out.println("Hello world!");

    /* Insert into table using prepared statement
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            String query="Insert into students(id,name,age,marks) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement=con.prepareStatement(query);
            //Statement statement=con.createStatement();
           preparedStatement.setInt(1,19);
           preparedStatement.setString(2,"ishita");
           preparedStatement.setInt(3,23);
           preparedStatement.setInt(4,98);

            int rowsAffected= preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("no data inserted");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
*/
        //Retrieve data using preparedstatement
    /*
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            String query="Select * from students where id=?";

            PreparedStatement preparedStatement=con.prepareStatement(query);
            preparedStatement.setInt(1,19);
           ResultSet resultSet=preparedStatement.executeQuery();
           if(resultSet.next()){
               double marks=resultSet.getDouble("marks");
               System.out.println("Marks: "+marks);
           }else{
               System.out.println("not found");
           }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
*/
      //update using preparedstatement
/*
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            String query="Update students SET marks=? where id=? ";
            PreparedStatement preparedStatement=con.prepareStatement(query);
            //Statement statement=con.createStatement();
            preparedStatement.setInt(1,100);
            preparedStatement.setInt(2,19);
            int rowsAffected= preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("data updated successfully");
            }else{
                System.out.println("no data updated");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
*/
        //delete from table

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            String query="delete from students where id=?";
            PreparedStatement preparedStatement=con.prepareStatement(query);
            //Statement statement=con.createStatement();
            preparedStatement.setInt(1,19);
            int rowsAffected= preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("data deleted successfully");
            }else{
                System.out.println("no data deleted");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
