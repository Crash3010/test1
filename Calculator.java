package Calculator;
import java.util.Scanner;

public class Calculator {

    private static Scanner read;

    public static void main (String[] args){

        read = new Scanner(System.in);

        int a;
        int b;
        String operator;

        a = read.nextInt();
        operator = read.next();
        b = read.nextInt();

        if (a <= 10 && b <=10) {
        	if (operator.equals("*")){
            System.out.println(a * b);
        	}
        	if (operator.equals("/")){
            System.out.println(a / b);
        	}
        	if (operator.equals("+")){
            System.out.println(a + b);
        	}
        	if (operator.equals("-")){
            System.out.println(a - b);
        	} 
        }
    } 
}