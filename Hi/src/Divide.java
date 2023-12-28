import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Number:\t");
        int firstNumber = input.nextInt();
        System.out.println("Second Number:\t");
        int secondNumber = input.nextInt();
        System.out.println(firstNumber / secondNumber);
    }
}
