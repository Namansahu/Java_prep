public class recursion1 {
    public static void printNumb(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void printSum(int i , int n , int sum){
     if ( i==n){
        sum +=i;
        System.out.println(sum);
        return;
     }      
         sum +=i;
        printSum(i+1, n, sum);;
    }

    public static int facotial(int n){
        if(n==1| n==0){
            return 1;
        }
        int fact_nm1 = facotial(n-1);
        int fact =n* fact_nm1;
        return fact;


    }


    //fibonacci
    public static void printFib(int a ,int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }


    //x power n 
    public static int calcPower( int x, int n){
        
        if(n==0){ //base case1
            return 1;
        }
        if(x==0){ //base case2
            return 0;
        }
        int xpownm1 =calcPower(x, n-1); // work 
        int xpown =x* xpownm1;
        return xpown;
    }

    // x ^ n with logn stack 

    public static int calcPoweroptm( int x, int n){
        
        if(n==0){ //base case1
            return 1;
        }
        if(x==0){ //base case2
            return 0;
        }
        if(n%2 ==0){ // n is even 
         return calcPoweroptm(x, n/2) * calcPoweroptm(x, n/2);
        }
        else{
            return calcPoweroptm(x, n/2)* calcPoweroptm(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int n =5;
        printNumb(n);
        printSum(1, 5, 0); // sum of n 
        int ans =facotial(n);  //factorial
        System.out.println("factorial is "+ ans);

        //fibonacci
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int term =7;
        printFib(a,b,term-2);

        // x^n //stack height n
        int x=2 ;
        int res = calcPower(x, n);
        System.out.println(res);


        //x ^n stack height logn   x ^n/2   * x^ n/2 * x
        int x1=2 ;
        int ans1 = calcPoweroptm(x1, n);
        System.out.println(" x^2 " + ans1);
    }
    
}
