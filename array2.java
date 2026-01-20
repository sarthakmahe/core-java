package untitled.src;

//given an int array of length 2,return true if the array
//does not contain 2 or 3
public class array2 {
    boolean meth1(int[] arr)   //8 2
    {
         if(arr[0]!=2 && arr[0]!=3 && arr[1]!=2 && arr[1]!=3){
             return true;
         }

         return false;

}


public static void main(String[] args) {

        array2 aobj = new array2();
         int input[] = {8, 4};
          boolean result = aobj.meth1(input);
    System.out.println(result);
       }
}
