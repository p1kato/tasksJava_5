package Task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.replace(" ", "");

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 60){
                i++;
                while(true){
                    if(s.charAt(i) != 62){
                        System.out.print(s.charAt(i));
                        i++;
                    }else{
                        System.out.print(' ');
                        break;
                    }
                }

            }
        }
    }
}

