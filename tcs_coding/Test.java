package tcs_coding;

public class Test {
    public static void main(String[] args) {
        int temp,digit,counter=0;
        int i=11;
                    temp=i;
                    while(i>0) {
                        i = i / 10;
                        counter++;
                    }
                    while(temp > 0)
        {
            digit = temp % 10;
            // System.out.println("Digit at place "+counter+" is: "+digit);
            if((digit!=1) &&(digit!=4) &&(digit!=6) &&(digit!=8) &&(digit!=9)){
                // temp = temp / 10;
                // counter--;
                if(counter!=0){
                temp = temp / 10;
                counter--;
                }
                else{
                    System.out.println("The loop is terminated the num is "+i);
                }
            }
            else{
                break;
            }
            
    }
}

}
