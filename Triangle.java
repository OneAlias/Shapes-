import java.util.Scanner;
class Triangle{
 public static void main(String args[]){
   //getting vars
   Scanner scr = new Scanner(System.in);
   
   System.out.print("Enter value for base of triangle: ");
   double base = scr.nextDouble();
   
   System.out.print("Enter value for the perpendicular high of triangle: ");
   double high = scr.nextDouble();
   
   //calculations
   double area = (base*high)/2;
   System.out.print("The area is: "+ area);
 }
 //method for init
 public  void  Triangle(){
   //getting vars
   Scanner scr = new Scanner(System.in);
   
   System.out.print("Enter value for base of triangle: ");
   double base = scr.nextDouble();
   
   System.out.print("Enter value for the perpendicular high of triangle: ");
   double high = scr.nextDouble();
   
   //calculations
   double area = (base*high)/2;
   System.out.print("The area is: "+ area);
 } 
}