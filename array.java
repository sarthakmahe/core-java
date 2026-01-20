package untitled.src;

public class array {
    int[] meth1(){
        System.out.println("method called");
        int arr[]={2,3,3};
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]==2) && (arr[i+1]==3)){
                arr[i+1]=0;
            }
        }
      return arr;
    }

    public static void main(String[] args) {
       array aobj=new array();
       int result[] =aobj.meth1();
       for(int x:result){
           System.out.print(x+" ");
       }
    }
}
