// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    private int height;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid, int hei) {
        length = len;
        width = wid;
        height = hei;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }

    public void printVolume() {
        int volume = length * width * height;
        System.out.println("My volume is " + volume);

    }


    public int calculateArea() {
        int calculateArea = (length * width);
        System.out.println("My area is " + calculateArea);
        return calculateArea;
    }

}





