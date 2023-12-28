import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, surname;
        System.out.println("Name:\t");
        name = input.next();
        System.out.println("Surname:\t");
        surname = input.next();
        System.out.println("Hello\n" + name + "\n" + surname);
    }
}