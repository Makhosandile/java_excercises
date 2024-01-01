import java.util.Scanner;

public class Multipl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number:\t");
        int num = input.nextInt();
        int answer;
        for (int i = 1; i <= 10; i++){
            answer = num * i;
            System.out.println(num + " X " + i + " " + answer);
        }
    }
}
