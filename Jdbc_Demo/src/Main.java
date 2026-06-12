import java.sql.*;

public class Main {
    private static final String url="jdbc:mysql://localhost:3306/jdbc";
   private static String username="root";
   private static String password="Password";

    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
      //connection with database
        try{
            Connection con=DriverManager.getConnection(url,username,password);
          //create statement
            Statement statement=con.createStatement();
          String query="select * from students";
        //for select use executequery
            //resultset to store table objcet
         ResultSet resultSet= statement.executeQuery(query);
         while(resultSet.next()){
             int id= resultSet.getInt("id");
             String name=resultSet.getString("name");
             int age= resultSet.getInt("age");
             double marks= resultSet.getDouble("marks");
             System.out.println("id: "+id);
             System.out.println("Name: "+name);
             System.out.println("marks: "+marks);
             System.out.println("age: "+age);
         }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }



    }
}