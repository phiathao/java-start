package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;
        
        Scanner scanObject = new Scanner(System.in);

        System.out.println("First Number: ");
        num1 = scanObject.nextInt();
        System.out.println("Second Number: ");
        num2 = scanObject.nextInt();
        System.out.println("What Operation?");
        operator = scanObject.next().charAt(0);

            switch (operator) {
                case '+': answer = num1 + num2;
                    break;
                case '-': answer = num1 - num2;
                    break;
                case '*': answer = num1 * num2;
                    break;
                case '/': answer = num1 / num2;
                    break;
            }
        System.out.println(num1 + " "+ operator + " " + num2 + " = " + answer);
    }
}