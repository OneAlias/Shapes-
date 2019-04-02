import java.util.Scanner;
class Parallelogram{ 
 public static void main(String []args){
    //getting var
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter perpendicular height: ");
    double hig = scr.nextDouble();
    
    System.out.print("Enter base: "); 
    double base = scr.nextDouble();
    
    //calculations
    double area =hig*base;
    System.out.print("The area is: "+ area);
 }
 //method for init
 public void Parallelogram(){
    //getting var
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter perpendicular height: ");
    double hig = scr.nextDouble();
    
    System.out.print("Enter base: "); 
    double base = scr.nextDouble();
    
    //calculations
    double area =hig*base;
    System.out.print("The area is: "+ area);
 }
}