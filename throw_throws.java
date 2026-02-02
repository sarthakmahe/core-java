package untitled.src;

import java.io.FileInputStream;

public class throw_throws {
    int avl_amt=10000;
    void withdraw(int wd_amt){
        {
            if(avl_amt<wd_amt)
            {
            throw new RuntimeException ("Balance is not sufficient");
            }
            else{
                System.out.println("withdraw successful");
            }
        }

    }
    void meth2()  throws Exception
    {
        FileInputStream fos=new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\ppt\\test.txt");
    //we need to write the logic to read from the file
    }

    public static void main(String[] args) throws Exception
    {
        throw_throws aobj=new throw_throws();
      //  aobj.withdraw(15000);
        //if try block used to access object for meth2 or we write throws
        //in method whwere we are calling
        aobj.meth2();
    }
}
