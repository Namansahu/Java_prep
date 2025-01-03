import java.util.Scanner;

public class array {
//   public static void main(String[] args) {
    
// //    int[] marks =new int[3];
// //    marks[0]=90;
// //    marks[1]=4;
// //    marks[2]=9;
// // //    int marks[] ={99,3,2};
   
// //    for (int i =0 ; i<3; i++)
// //    {
// //     System.out.println(marks[i]);
// //    }
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int number[]= new int[size];
// for(int i =0; i<size; i++)
// {
//     number[i]=sc.nextInt();

// }
// int x =sc.nextInt();
//  for (int i =0 ; i<number.length; i++)
//    {
//    if(number[i]==x){
//     System.out.println("x found");
//    }
//     // System.out.println(number[i]);
//    }

//   }  
// }



// 2d array
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int rows =sc.nextInt();
   int cols=sc.nextInt();
   int[][] numbers = new int[rows][cols];
   
   for(int i=0;i<rows;i++){
    for( int j=0;j<cols;j++)
    {
        numbers[i][j] =sc.nextInt();
    }
   }
   int x =sc.nextInt();
   for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++)
    { //liner search
        if (numbers[i][j]==x){
            System.out.println("x found at location  (" + i + " , " + j + " )" );
        }
        // System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
   }





}


}
