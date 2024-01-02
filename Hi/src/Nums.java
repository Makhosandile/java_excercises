import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number:\t");
        int num = input.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", num, num, num, num, num, num );
    }
}
