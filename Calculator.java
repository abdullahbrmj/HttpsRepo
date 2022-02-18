import java.util.Scanner;

public class Calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double num2 = sc.nextDouble();

        System.out.println("Please Enter The Operation (+ , - , * , /) : ");
        char op = sc.next().charAt(0);

        double result = Cal(num1 , num2 , op);

        System.out.println(result);

    }
    public static double Cal(double a, double b, char ope){
        double result = 0;
        switch (ope){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
    }
}
