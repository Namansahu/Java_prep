import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for(int counter =0; counter <11 ; counter++){
        //     // System.out.println("hello world");
        //     System.out.println(counter + " ");
        // }
        // int i=0;
        // while (i<11) {
        //     System.out.println(i);
        //     i++;
        // }

        try (// do{
                //     System.out.println(i);
                //     i++;
                // }while(i<11);
        Scanner sc = new Scanner(System.in)) {
            int n =sc.nextInt();
            // int sum =0;
            // for(int i=1;i<=n;i++)
            // {
            //     sum =sum+i;
            // }
            // System.out.println(sum);

            for(int i=1; i<11;i++){
                System.out.println(i*n);
            }
        }


    }
}
