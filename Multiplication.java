import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("input multiplication : ");
        Long multiplication = in.nextLong();
        for (int i = 1; i <= 12; i++) {
            System.out.println(multiplication + " x " + i + " = " + multiplication * i);
        }
    }
}