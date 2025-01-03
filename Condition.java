import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age >18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not adult");;
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a== b){
            System.out.println("adult");
        }
        else if (a>b) {
            System.out.println("a is greater then b");
        }
        else{
            System.out.println("b  is grester then a");;
        }
    }
    
}
