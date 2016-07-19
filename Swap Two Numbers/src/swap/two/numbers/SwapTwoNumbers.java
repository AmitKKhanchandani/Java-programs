/*
 * Downloaded From http://www.amitk.co.in
 */
package swap.two.numbers;

import java.util.Scanner;

/**
 *
 * @author AmitK
 */
public class SwapTwoNumbers {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1,num2,swap;
        System.out.println("Enter 1st number");
        
        num1=s.nextInt(); //Reading input from user
        
        System.out.println("Enter 2nd number");
        
        num2=s.nextInt(); //Reading input from user
        
        //Swapping Function
        swap=num2;
        num2=num1;
        num1=swap;
        
        System.out.println("Number 1: "+num1+" Number 2: "+num2);
    }
    
}
