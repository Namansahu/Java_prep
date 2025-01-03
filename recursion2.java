import java.util.HashSet;

public class recursion2 {
    public static void towerOfHanoi(int n , String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

// revers of string
    public static void printRev(String str , int idx){
        if(idx ==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static int first = -1;
    public static int last =-1;

    public static void findOccurance(String str , int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
  return;
        }
        char currChar = str.charAt(idx);
        if(currChar ==element){
            if ( first == -1){
                first =idx;
            }else{
                last =idx;
            }
        }
        findOccurance(str, idx+1, element);
    }



    public static boolean isSorted( int arr[], int idx){
        if( idx == arr.length-1){
            return true;
        }
        if(arr[idx]< arr[idx+1]){
           return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }


    public static void moveALLx(String str,int idx , int count, String newString){
        if(idx == str.length()){
            for(int i =0; i< count;i++){
                newString+='x';

            }
            System.out.println(newString);
            return;
        }
        char currChar =str.charAt(idx);
        if(currChar =='x'){
            count++;
            moveALLx(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveALLx(str, idx+1, count, newString);
        }
    }


    // remove duplicate from string 

    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str , int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a']){
            removeDuplicate(str, idx+1, newString);
        }
        else{
            newString +=currChar;
            map[currChar -'a'] =true;
            removeDuplicate(str, idx+1, newString);
        }
    }



    // subsequence of string 

    public static void subsequences(String str , int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // tobe in subsequence 
        subsequences(str, idx+1, newString+currChar);

        // not to come in subsequence 
         subsequences(str, idx+1, newString);

    }



    // subsequence of string 

    public static void subsequencesunique(String str , int idx , String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString))
{
    return;
}else{            System.out.println(newString);
      set.add(newString);
            return;}
        }

        char currChar = str.charAt(idx);

        // tobe in subsequence 
        subsequencesunique(str, idx+1, newString+currChar,set);

        // not to come in subsequence 
         subsequencesunique(str, idx+1, newString,set);

    }

    //keyboard 
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};
public static void printKeypadCombination(String number, int idx, String res) {
        if(idx == number.length()) {
            System.out.println(res);
            return;
        }

        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
                char curr = keypad[number.charAt(idx)-'0'].charAt(i);
                printKeypadCombination(number, idx+1, res+curr);
            }
    }
    public static void main(String[] args) {
        int n =3;
        towerOfHanoi(n, "S", "H", "D"); //time complexity  2^n 

        
        // rever of string
        String str= "abcd";
        printRev(str, str.length()-1);


        //find occurance of element 
        String str1= "abaacdaefaah";
        findOccurance(str1, 0,'a');



        // is sorted   strictly incresing only
        int arr[] ={1,3,5};
        System.out.println(isSorted(arr, 0));


        //move all x to end od string abcxdxxg  -> abcdgxxx
        String str2="axbcxdxx";
        moveALLx(str2, 0, 0, ""); // O(n)


        // remove duplicate char from string 
          String str3String ="abbccda";
          removeDuplicate(str3String, 0, "");  //O(n)



        // subsequence of string  abc    abc ab ,bc,ac,a,b,c
        String strsubString ="abc";
        subsequences(strsubString, 0, "");
        
        // print all unique subsequence  of string  // hashset unique element 
        String strsubString1 ="aaa";
        HashSet<String> set =new HashSet<>();
        subsequencesunique(strsubString1, 0, "",set);



        //keyboard print
        String number = "23";
printKeypadCombination(number, 0, "");
    }
    
}
