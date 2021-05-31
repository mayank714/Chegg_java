package Java_Coding_ques;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String st = " This is my Writer project";
        pw.println("Hello world" + st);
    }
}
