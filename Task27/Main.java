package Task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        String op1 = in.next();
        int y = in.nextInt();
        String op2 = in.next();
        int z = in.nextInt();

        if(op1.equals("+") && op2.equals("+")){
            System.out.print(x + y + z);
        }
        else if(op1.equals("+") && op2.equals("-")){
            System.out.print(x + y - z);
        }
        else if(op1.equals("+") && op2.equals("*")){
            System.out.print(x + y * z);
        }
        else if(op1.equals("+") && op2.equals("/")){
            System.out.print(x + y / z);
        }
        else if(op1.equals("-") && op2.equals("+")){
            System.out.print(x - y + z);
        }
        else if(op1.equals("-") && op2.equals("-")){
            System.out.print(x - y - z);
        }
        else if(op1.equals("-") && op2.equals("*")){
            System.out.print(x - y * z);
        }
        else if(op1.equals("-") && op2.equals("/")){
            System.out.print(x - y / z);
        }
        else if(op1.equals("*") && op2.equals("+")){
            System.out.print(x * y + z);
        }
        else if(op1.equals("*") && op2.equals("-")){
            System.out.print(x * y - z);
        }
        else if(op1.equals("*") && op2.equals("*")){
            System.out.print(x * y * z);
        }
        else if(op1.equals("*") && op2.equals("/")){
            System.out.print(x * y / z);
        }
        else if(op1.equals("/") && op2.equals("+")){
            System.out.print(x / y + z);
        }
        else if(op1.equals("/") && op2.equals("-")){
            System.out.print(x / y - z);
        }
        else if(op1.equals("/") && op2.equals("*")){
            System.out.print(x / y * z);
        }
        else if(op1.equals("/") && op2.equals("/")){
            System.out.print(x / y / z);
        }
    }
}
