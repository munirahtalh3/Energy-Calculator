import java.util.Scanner;
public class Energy{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in); 
        System.out.print("Enter the mass in kg");
        double m= input.nextDouble();
        int c= (int) (3*(Math.pow(10,8)));
        double e= m*c*c;
        System.out.println("The energy is"+e+"J");
    }
}
