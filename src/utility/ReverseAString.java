package utility;

public class ReverseAString {

        public static void main(String[] args) {
            String str="ABCD";
            String reverse="";

            for(int i=str.length()-1;i>=0;i--){
                String st=""+str.charAt(i);
                if (!reverse.contains(st)) {

                    reverse+=st;
                }
            }
            System.out.println(reverse);
        }
    }


