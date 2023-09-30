import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();


        Rectangle rect1 = newRectangle(rect1Length, rect1Width);
        Rectangle rect2 = newRectangle(rect2Length, rect2Width);

int area1 = rect1.calculateArea();
int area2 = rect2.calculateArea();


        System.out.println("Rectangle 1:" + area1);
        System.out.println("Rectangle 2:" + area2);


        // write the rest of your program below
    }




}
