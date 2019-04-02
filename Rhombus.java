import java.util.Scanner;
class Rhombus{ 
 public static void main(String []args){
    //getting var
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter lenght: ");
    double len = scr.nextDouble();
    
    System.out.print("Enter height: "); 
    double hig = scr.nextDouble();
    
    //calculations
    double area =(len*hig)/2;
    System.out.print("The area is: "+ area);
 }
 //method for init
 public void Rhombus(){
    //getting var
    Scanner scr = new Scanner(System.in);
    System.out.print("Enter lenght: ");
    double len = scr.nextDouble();
    
    System.out.print("Enter height: "); 
    double hig = scr.nextDouble();
    
    //calculations
    double area =(len*hig)/2;
    System.out.print("The area is: "+ area);
 }
}