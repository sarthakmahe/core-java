import java.sql.*;

public class CRUD_Statement {

    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static String username = "root";
    private static String password = "Password";

    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
//INSERT INTO STUDENTS
       /* try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement statement=con.createStatement();
            String query=String.format("Insert into students(id,name,age,marks) VALUES(%o,'%s',%o,%f)",4,"Aaaa",23,74.5);

            int rowsAffected= statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("no data inserted");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
*/
        //UPDATE INTO STUDENTS
   /*
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement statement=con.createStatement();
            String query=String.format("Update students SET marks=%f where id=%d",89.5,2 );

            int rowsAffected= statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("data updated successfully");
            }else{
                System.out.println("no data updated");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
*/
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement statement=con.createStatement();
            String query="Delete from students where id=2";

            int rowsAffected= statement.executeUpdate(query);
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
