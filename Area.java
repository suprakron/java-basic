import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
    System.out.print(" Input value of Width : ");
    float Width = scan.nextFloat();
  
    System.out.print(" Input value of Long : ");
    float Long = scan.nextFloat();
       
    System.out.printf(" Area of a Rectangle is %.2f ", Width * Long);
     
    scan.close();
}
}