package untitled.src;

public class Programming {
    Programming(){
        System.out.println("i love programming language");

    }
    Programming(String s){
        System.out.println("i love "+s);
    }

    public static void main(String[] args) {
      new Programming("java");
      new Programming();

    }
}
