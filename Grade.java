import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("คะแนน: ");
        double point = sc.nextDouble();

        if (point >= 80) {
            System.out.println("Grade A");
        } else if (point >= 70) {
            System.out.println("Grade B");
        } else if (point >= 60) {
            System.out.println("Grade C");
        } else if (point >= 50) {
            System.out.println("Grade D");
        } else if (point < 50) {
            System.out.println("Grade F");
        }
    }
}