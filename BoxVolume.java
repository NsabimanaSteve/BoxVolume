import java.util.Scanner;
public class BoxVolume{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double length,height, width;
        System.out.println("Enter the length of box ");
        length = keyboard.nextDouble();
        System.out.println("Enter the height of box ");
        height = keyboard.nextDouble();
        System.out.println("Enter the width of box ");
        width = keyboard.nextDouble();
        double volume=calculateVolume(length,height,width);
        
        System.out.println("The volume of the the box is " + volume + "Cubic units " );
        //scanner.close();      
    }
    public static double calculateVolume(double length, double height, double width){
        return length*width*height;
    
    }
}
