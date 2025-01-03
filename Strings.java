import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is "+ name);


        String fname ="naman";
        String lname ="sahu";
        String fullname = fname +lname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        //charat
        for(int i =0 ; i< fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));
        }
        if(fname.compareTo(fullname)==0){
System.out.println("strings are euals");
        }else{
            System.out.println("string is not equals");
        }

        String sentence ="my name is naman";
        String name =sentence.substring(11,sentence.length());
        System.out.println(name);

        //strings are immutable: we cant chamge string 
    }
    
}
