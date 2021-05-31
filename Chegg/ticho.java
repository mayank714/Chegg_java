package Chegg;

public class ticho {
    public static void main(String[] args) {
        try {
            int a,b;
            b=0;
            a=5/b;
            System.out.println("A");
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("B");
        }
    }
}
