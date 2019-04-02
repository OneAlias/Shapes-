import java.util.Scanner;
class Trapezium{
  public static void main(String args[]){
   Scanner scr = new Scanner(System.in);
   //getting var   
   System.out.print("What is the minor base? "); 
   double minBase = scr.nextDouble();
   
   System.out.print("What is the major base? ");
   double majBase = scr.nextDouble();
   
   System.out.print("What is the height? ");
   double high = scr.nextDouble();
   
   //calculations
   
   double area = ((minBase+majBase)*high)/2;
   System.out.print("The area is: " + area);
  }
  //method for init
  public void Trapezium(){
   Scanner scr = new Scanner(System.in);
   //getting var   
   System.out.print("What is the minor base? "); 
   double minBase = scr.nextDouble();
   
   System.out.print("What is the major base? ");
   double majBase = scr.nextDouble();
   
   System.out.print("What is the height? ");
   double high = scr.nextDouble();
   
   //calculations
   
   double area = ((minBase+majBase)*high)/2;
   System.out.print("The area is: " + area);
  }
}