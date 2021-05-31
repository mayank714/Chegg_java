import java.io.PrintWriter;
    
public class Writer {
 public static void main(String args[])
 {
 PrintWriter pw = new PrintWriter(System.out,true);
 String st = "Loda lasssun";
 pw.println("This is " + st);
}
}
