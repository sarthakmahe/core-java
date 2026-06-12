import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static String username = "root";
    private static String password = "Password";

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //INSERT INTO STUDENTS
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            String query="Insert into students(id,name,age,marks) Values(?,?,?,?)";
            PreparedStatement preparedStatement=con.prepareStatement(query);
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("enter id: ");
                int id=sc.nextInt();
                System.out.println("enter name: ");
                String name=sc.next();
                System.out.println("enter age: ");
                int age=sc.nextInt();
                System.out.println("enter marks: ");
                double marks=sc.nextDouble();
                System.out.println("enter more data(Y/N): ");
                String choice=sc.next();
                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,name);
                preparedStatement.setInt(3,age);
                preparedStatement.setDouble(4,marks);

                preparedStatement.addBatch();

                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }

            int[] arr =preparedStatement.executeBatch();
           /* if(arr.length>0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("no data inserted");
            }
*/
             for(int i=0;i< arr.length;i++){
             System.out.println("query: " +i+ "not executed successfully!!!");
             }

           /* String query=String.format("Insert into students(id,name,age,marks) Values('%d','%s','%d','%f'");
            PreparedStatement preparedStatement=con.prepareStatement(query);
            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"sarthak");
            //Statement statement=con.createStatement();

            int rowsAffected= preparedStatement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("no data inserted");
            }
*/

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

}