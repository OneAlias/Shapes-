import java.util.Scanner;
class Rectangle{ 
 public static void main(String []args){
    //getting var
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter lenght: ");
    double len = scr.nextDouble();
    System.out.print("Enter breath: "); 
    double brd = scr.nextDouble();
    
    //calculations
    double area =len*brd;
    System.out.print("The area is: "+ area);
 }
 //method for init
 public  void Rectangle(){
    //getting var
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter lenght: ");
    double len = scr.nextDouble();
    System.out.print("Enter breath: "); 
    double brd = scr.nextDouble();
    
    //calculations
    double area =len*brd;
    System.out.print("The area is: "+ area);
 }
}