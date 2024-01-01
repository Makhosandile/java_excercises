import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number:\t");
        int firstNumber = input.nextInt();
        System.out.println("Second number:\t");
        int secondNumber = input.nextInt();

        if(firstNumber != secondNumber){
            System.out.println(firstNumber + " != " + secondNumber);
        }
        if(firstNumber >= secondNumber){
            System.out.println(firstNumber + " >=" + secondNumber);
        }
        if(firstNumber == secondNumber){
            System.out.println(firstNumber + " == " + secondNumber);
        }
        if(firstNumber <= secondNumber){
            System.out.println(firstNumber + " <= " + secondNumber);
        }
        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " > " + secondNumber);
        }
        if(firstNumber < secondNumber){
            System.out.println(firstNumber + " < " + secondNumber);
        }
    }
}
