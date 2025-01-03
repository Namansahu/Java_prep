import java.util.Scanner;

public class operator_binary {
    //bit maniplation get set clear update   
    // bit mask new term as tempary 1<<i  then operation (AND) 
public static void main(String[] args) {
  ///get bit
    // int n =5; //0101
    // int pos=2;
    // int bitmask = 1<<pos;

    // if((bitmask & n )==0){
    //     System.out.println("bit was zero");
    // }
    // else{
    //     System.out.println("bit was one");
    // }
  //set bit 
//   int n =5; //0101
    // int pos=1;
    // int bitmask = 1<<pos; //or operation 

    // int newNumber =bitmask | n;
    // System.out.println(newNumber);

  //clear bit  bitmask = 1<<i operation  AND with not bitmask

//    int n =5; //0101
//     int pos=2;
//     int bitmask = 1<<pos;

//     int notbitmask= ~(bitmask);
//     int newNumber =notbitmask & n;
//     System.out.println(newNumber);



    //update bit    
    // for 0  bitmask 1<<i operation : AND with NOT
    //for 1 bitmask i<<i operation OR
    Scanner sc =new Scanner(System.in);
    int oper =sc.nextInt();
    int n =5; //0101
        int pos=1;
        // int oper=1;
        int bitmask = 1<<pos;
        if (oper ==1){
         

          int newNumber =bitmask | n;
         System.out.println(newNumber);
        }

        else{
         int notbitmask= ~(bitmask);
         int newNumber =notbitmask & n;
         System.out.println(newNumber);
        }
}

}
