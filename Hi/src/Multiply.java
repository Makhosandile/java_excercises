import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number:\t");
        int firstNumber = input.nextInt();
        System.out.println("Second number:\t");
        int secondNumber = input.nextInt();
        System.out.println(firstNumber * secondNumber);
    }
}
