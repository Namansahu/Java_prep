public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("NAMAN");
        System.out.println(sb);

        //charat
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert 
        sb.insert(0, 'S');
        System.out.println(sb);


        //delete
        sb.delete(0, 1);
        System.out.println(sb);

        sb.append("w");
        sb.append("l");
        System.out.println(sb);




        //Reverse a string
        StringBuilder revb =new  StringBuilder("hello");
        for(int i =0 ; i< revb.length()/2; i++){
            int front =i;
            int back =revb.length() -1 -i;
            char frontchar = revb.charAt(front);
            char backchar = revb.charAt(back);

            revb.setCharAt(front, backchar);
            revb.setCharAt(back, frontchar);
        }
        System.out.println(revb);
    }
    
}
