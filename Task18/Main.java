package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        s = s.toLowerCase();
        String res1 = "";
        String res2 = "";

        for (int i = 0; i < s.length(); i++) {
            res1 = s.charAt(i) + res1;
        }

        for (int j = s.length() - 1; j >= 0; j--) {
            res2 = s.charAt(j) + res2;

        }

        if(res1.equals(res2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}