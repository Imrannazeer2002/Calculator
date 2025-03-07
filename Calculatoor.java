package Arrayscoding;

import java.util.Scanner;

public class Calculatoor {
    public static double opertions(double n, double m, char operator){
        double result=0;
        switch (operator) {
            case '+':
             result=n+m;
             break;
             case '-':
             result=n-m;
             break;
             case'*':
             result=n*m;
             break;
             case'/':
             if(m!=0){
                result =n/m;
             }else{
                System.out.println("error");
             }
             break;
            default:
            System.out.println("invalid opertor");
                break;
        }
        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double result=0;
        boolean continuecalculation = false;

        do{
            double n, m;
            char operator;
        if(continuecalculation){
            n=result;
            System.out.println("current result"+n);
        }else{
            System.out.println("Enter the first number :");
            n=sc.nextInt();
        }
        System.out.println("Enter operator");
        char operators= sc.next().charAt(0);

        System.out.println("enter second number");
         m=sc.nextInt();
           
        result =opertions(n, m, operators);
            System.out.println("Result: " + result);

            System.out.print("Do you want to continue with this result? (yes/no): ");
            
            String choice = sc.next();
            continuecalculation= choice.equalsIgnoreCase("yes");

        } while (continuecalculation);
        System.out.println("Calculator exited");
      }
   }

