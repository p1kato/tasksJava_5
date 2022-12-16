package Task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) >= 65 && text.charAt(i) <= 90){
                System.out.print(Character.toLowerCase(text.charAt(i)));


            }else if((text.charAt(i) >= 97 && (text.charAt(i) <= 122))){
                System.out.print(Character.toUpperCase(text.charAt(i)));
            }else if(text.charAt(i) == ' '){
                System.out.print(' ');
            }
        }

    }
}

