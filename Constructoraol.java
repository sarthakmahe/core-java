package untitled.src;

public class Constructoraol {
    Constructoraol(){
        this("java");
        System.out.println("default constructor");
    }
    Constructoraol(String s){
        this(5000,"java");
        System.out.println(s);
    }
    Constructoraol(int a,String s){

        System.out.println(a);
    }

    public static void main(String[] args) {
      new Constructoraol();

    }
}
