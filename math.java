import java.util.*;

class Main {
    public static double  Find(double a, double b){
       double x=(Math.sqrt((3*a)+1))/b; // Math equation for Evalute given expression
       return x;
    }
    public static void main(String[]args){
       Scanner sc= new Scanner (System.in); // Scanner calss is used for getting INPUT from USER
       double a=sc.nextDouble(); // input a
       double b=sc.nextDouble(); // input b
       double ans= Find(a,b);   
       System.out.print(ans); // Final answer
    }
}
