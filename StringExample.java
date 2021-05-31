public class StringExample {
    public void String() {
        String s1= "Hello"; // First Method of the String
        char ch[] = {'H','e','l','l','o','o'}; //Second Method of the String
        String s2 = new String(ch); // Third method of the string (Using New Keyword)
        String s3 = new String("Java Basics");
        String s4= "Hello Java";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4.length());
        System.out.println(s4.toUpperCase());
        System.out.println(s1+" "+s4);
        // System.out.println(str1.concat(" ").concat(str4));
        String s5 = "YYYYY";
        System.out.println(s5.isEmpty());

        String s6 = s5.replace("YYYYY", "XXXX");
        System.out.println(s6);
    }
    public static void main(String[] args) {
        StringExample obj= new StringExample();
        obj.String();
        
    }
}