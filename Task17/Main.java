package Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1= in.next();
        String s2= in.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String res1 = "";
        String res2 = "";

        for (int i = 0; i < s1.length(); i++) {
            res1 = s1.charAt(i) + res1;
        }

        for (int j = s2.length() - 1; j >= 0; j--) {
            res2 = s2.charAt(j) + res2;

        }

        if(res1.equals(res2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}