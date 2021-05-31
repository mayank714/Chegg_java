package Chegg;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Using scanner get the user input
        Scanner scan = new Scanner(System.in);

        String [] name;
        int [] secretNum;

        System.out.print("Enter the number of names: ");
        int num = scan.nextInt();
        scan.nextLine();
        name = new String[num];
        secretNum = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.print("(" + (i + 1)+") Enter a name: ");
            name[i] = scan.nextLine();
        }
        //Method 2 String
        System.out.print("Enter a String for Method 2: ");
        String method2String = scan.nextLine();

        System.out.println("Possible combination methods\n"
                + "(1) Multiplication\n"
                + "(2) Addition");
        System.out.print("Enter a combination method: ");
        //Get input
        int combinationMethod = scan.nextInt();

        System.out.println("Method 1");
        //Display Method 1 details to user
        for (String s : name) {
            System.out.println(s + " " + getSquareRoot(s));
        }
        //Display Method 2 details to user
        System.out.println("Method 2 (using a String from the user)");

        for (String s : name) {
            System.out.println(s + " and " + method2String + " " + computeConsonants(s, method2String));

        }
        //Display Method 3 details to user
        System.out.println("Method 3 (using the left-most position)");

        for (String s : name) {
            System.out.println(s + " " + retrieveCharacterInString(s, 0));

        }
        //For multiplication
        if(combinationMethod == 1)
        {
            System.out.println("Secret Numbers ");
            for(int i = 0; i < name.length; i++)
            {
                secretNum[i]=getSquareRoot(name[i])*retrieveCharacterInString(name[i],0)*computeConsonants(name[i], method2String);
                System.out.println(name[i] + " " +secretNum[i]);

            }
        }
        //For addition
        else if(combinationMethod == 2)
        {
            System.out.println("Secret Numbers ");
            for(int i = 0; i < name.length; i++)
            {
                secretNum[i]=getSquareRoot(name[i])+retrieveCharacterInString(name[i],0)+computeConsonants(name[i], method2String);
                System.out.println(name[i] + " " +secretNum[i]);

            }
        }
        //Sort and display names and secretnum
        sortAndDisplay(name, secretNum);

    }

    /*
     * A public static int method that accepts a String formal parameter, computes
     * the square root of the String’s length, and returns the ceiling (i.e.,
     * Math.ceil) of the value. The actual parameter sent to this method must be a
     * name from the array.
     */

    public static int getSquareRoot(String val)
    {
        return (int) Math.ceil(Math.sqrt(val.length()));
    }

    /*
     * A public static int method that accepts two Strings as formal parameters.
     * This method computes and returns the number of consonants in common between
     * the two Strings, ignoring upper-case and lower-case. (Hint: Count how many of
     * each of the 19 consonants are in both Strings using two counting arrays, then
     * check how many positions in both counting arrays are non-zero.) Should there
     * be no Strings in common, the number one (1) is returned.
     */

    public static int computeConsonants(String str1,String str2)
    {
        char[] consonants = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','X','Z'};

        int [] countArr1 = new int[19];
        int [] countArr2 = new int[19];

        for(int i = 0; i < str1.length(); i++)
        {
            for(int j = 0; j < consonants.length; j++)
            {
                if(str1.toUpperCase().charAt(i) == consonants[j])
                    countArr1[j] = 1;
            }
        }

        for(int i = 0; i < str2.length(); i++)
        {
            for(int j = 0; j < consonants.length; j++)
            {
                if(str2.toUpperCase().charAt(i) == consonants[j])
                    countArr2[j] = 1;
            }
        }
        int count = 0;
        for(int i = 0; i < str1.length(); i++)
        {
            if(countArr1[i] == countArr2[i] && countArr1[i] == 1)
                count++;
        }

        if(count == 0)
            return 1;
        else
            return count;
    }

    /*
     * A public static int method that accepts one integer and one String as formal
     * parameters. Retrieve the character in the String parameter at the position
     * indicated by the integer parameter. The character is then cast to an integer
     * and returned to the calling method. Should the integer be an invalid position
     * for the given String, the number one (1) is returned.
     */

    public static int retrieveCharacterInString(String str,int pos)
    {
        try
        {
            return str.charAt(pos);
        }
        catch(IndexOutOfBoundsException e)
        {
            return 1;
        }
    }
    /*
     * A public static void method that accepts a String array and an integer array
     * as formal parameters and prints the values in alphabetical order of the names
     * array
     */
    public static void sortAndDisplay(String[] names,int[] keys)
    {
        String tempName;
        int tempNum;
        for(int i = 0; i < names.length - 1; i++)
        {
            for(int j = i + 1;j < names.length; j++)
            {
                //Compare and swap
                if(names[i].compareTo(names[j]) > 0)
                {
                    tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                    tempNum = keys[i];
                    keys[i] = keys[j];
                    keys[j] = tempNum;
                }
            }
        }
    }
}