import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value x ");
    float x=sc.nextFloat();
    System.out.print("Enter the operator ");
    char operator=sc.next().charAt(0);
    System.out.print("Enter the value of y ");
    float y=sc.nextFloat();
    
    switch(operator){
        case '+': System.out.println(x+y);
        break;
        case '-': System.out.println(x-y);
        break;
        case '*': System.out.println(x*y);
        break;
        case '/': System.out.println(x/y);
        break;
        case '%': System.out.println(x%y);
        break;
        default : System.out.println("Something is wrong");
       
    }
    }

}
