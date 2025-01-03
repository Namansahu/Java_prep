import java.util.ArrayList;

public class recursion3 {
 /// backtracking 
    //1 all posible permutations of string 
    public static void printPermutaions(String str, String permutation){
        if(str.length() ==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0 ; i< str.length();i++){
            char currChar =str.charAt(i);

            //abc => "bc"
            String newstr = str.substring(0, i)+ str.substring(i+1);
            printPermutaions(newstr, permutation+currChar);
        }
    }



    //  all path for matrix ti reach 00 , nm  
    public static int countPaths( int i ,int j ,int n , int m){
          //base 
          if(i==n || j==m){
            return 0;
          }
          if( i==n-1 && j ==m-1){
            return 1;
          }
        // move downward
        int downpaths =countPaths(i+1, j, n, m);

        // move right 
        int rightpaths =countPaths(i, j+1, n, m);

        return downpaths+rightpaths;

    }


 // no of ways we can place tile horizotal or vertical 
    public static int placeTiles(int n, int m) {
        if(n < m) {
            return 1;
        } else if(n == m) {
            return 2;
        }
 
 
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }
 
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        // single
        int ways1 = callGuests(n-1);

        //pair 
        int ways2 = (n-1)* callGuests(n-2);

        return ways1+ways2;

    } 



    

   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }

// print all subset of set of  first n natural numbers
   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }


       findSubsets(n-1, subset);
       subset.add(n);
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }

 
    public static void main(String[] args) {
    // all permutaion  == O(n!)
      String str ="abc";
      printPermutaions(str, "");  


    // count total path in maze to 00 , mn  only right and downward move allowed
      int n =3 , m=3;
      int totalpaths =countPaths(0, 0, n, m);
      System.out.println(totalpaths);


      // place no of ways tile fit 
      int n1 = 4, m1 = 4;
      System.out.println(placeTiles(n1, m1));


      // no of ways in which you can invite n people  to your party 
      // single, pair 
      int nw=4;
      System.out.println(callGuests(nw));

      // print all subset of set of  first n natural numbers
       int ns=3;
       findSubsets(ns, new ArrayList<Integer>());
}
    
}
