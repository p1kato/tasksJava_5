package Task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

