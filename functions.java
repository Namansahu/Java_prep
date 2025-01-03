import java.util.Scanner;

public class functions {

//     public static int calculateSum(int a , int b)
// {
//     int sum =a+b;
//     return sum;
// }

//    public static int calcProduct(int a, int b){
//     return a*b;
//    }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       int sum =calculateSum(a, b);
//       System.out.println("sum is " +sum);
//       System.out.println("product id " +calcProduct(a, b));

//     }



//factorial
public static void printFactorial(int n){
    int factorial=1;
    if (n<0){
        System.out.println(" invalid number");
        return;
    }
    for(int i =n ; i>=1 ; i--){
        factorial= factorial *i;

    }
    System.out.println(factorial);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
printFactorial(n);
}
    
}
