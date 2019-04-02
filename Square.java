import java.util.Scanner;
class Square{
 public static void main(String args[]){
     //getting var
  Scanner scn = new Scanner(System.in);
  System.out.print("What's the lenght of the square? ");
  
  double len = scn.nextInt();
  
  //calcultaions
  double area = len*len;
  System.out.print("The area is: " + area);
    }
 //method for init
 public  void Square(){
     //getting var
  Scanner scn = new Scanner(System.in);
  System.out.print("What's the lenght of the square? ");
  
  double len = scn.nextInt();
  
  //calcultaions
  double area = len*len;
  System.out.print("The area is: " + area);
    }    
}
