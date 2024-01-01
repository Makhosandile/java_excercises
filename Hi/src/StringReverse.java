import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name:\t");
        char[] sentence = input.nextLine().toCharArray();
        for(int i = sentence.length-1; i >= 0; i--){
            System.out.print(sentence[i]);
        }

    }
}
