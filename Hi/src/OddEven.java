import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number:\t");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.print("Even");
        }else
            System.out.print("Odd");
    }
}
