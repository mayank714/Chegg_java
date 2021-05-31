package Java_Coding_ques;
import java.io.IOException;
import java.util.Scanner;

public class RevString{
    void main() throws IOException{
      Scanner input = new Scanner(System.in); 
      System.out.println("Hellooooooo");
      try{
        String str = input.nextLine();
        System.out.println("You have entered "+str);
      byte[] strAsByteArray = str.getBytes();
      System.out.println(strAsByteArray);
       
      byte[] result = new byte[strAsByteArray.length];
      // System.out.println(result);
      // Store result in reverse order into the
      // result byte[]
      for (int i = 0; i < strAsByteArray.length; i++)
          result[i] = strAsByteArray[strAsByteArray.length - i - 1];
      
      System.out.println(new String(result));
          }
          finally{
            input.close();
          }
      }
 
                   
  
 
    public static void main(String[] args) throws IOException {
      RevString obj=  new RevString();
      obj.main();
    }
}
 
