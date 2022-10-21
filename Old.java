import java.util.Scanner;

public class Old {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("กรุณาป้อนอายุของคุณ: ");
        double point = sc.nextDouble();
        if (point >= 15) {
            System.out.println("วัยเด็ก");
        } else if (point >= 25) {
            System.out.println("วัยรุ่น");
        } else if (point >= 55) {
            System.out.println("วัยชรา");
        } 
    }
}