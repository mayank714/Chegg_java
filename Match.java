import java.util.Scanner;
public class Match {
    void main() throws Exception {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        // String c = String.valueOf(a);
        // String d = String.valueOf(b);
        char[] first  = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        int count =0;
        for(int i=0;i<= a.length();i++){
            
            if(first[i] != second[i]){
                break;
            }
            else
                count=count+1;
            //    break;
            
            
            System.out.println(count);
        }
        System.out.println(count);
        scan.close();
    }
    public static void main(String[] args) throws Exception{
        Match obj=new Match();
        obj.main();
    }
}
