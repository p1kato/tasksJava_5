package Task16;

import java.util.Scanner; // аски код роль играет жиесть

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                sum += (int)s.charAt(i) - 48;
            }
        }
        System.out.println(sum);
    }
}

