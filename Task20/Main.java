package Task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // от 42 до 47 включительно

        int x = in.nextInt();
        String op = in.next();
        int y = in.nextInt();
//(+, -, * , /)
        if(op.equals("+")){
            System.out.println(x + y);
        }else if(op.equals("-")){
            System.out.println(x - y);
        }else if(op.equals("*")){
            System.out.println(x * y);
        }else if(op.equals("/")){
            System.out.println(x / y);
        }
    }
}
