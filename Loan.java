import java.util.Scanner;
public class Loan {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("ONLY INPUT THE NUMBER VALUE");
        System.out.println("DO NOT INCLUDE ANY SYMBOLS");
        System.out.println("What is the amount of car loan: (Dollar Amount)");
        int carLoan = input.nextInt();
        // --Car loan
        System.out.println("What is the loan length: (Number in Years)");
        int loanLength = input.nextInt(); 
        // This will represent a loan length of 3 years
        System.out.println("What is the interest rate: (Percentage Amount)");
        int interestRate = input.nextInt();
        // This will represent an interest rate of 5% on the loan
        System.out.println("What is the down payment: (Dollar Amount)");
        int downPayment = input.nextInt();
        // This will represent the down payment provided by user for this car purchase
         
            if (loanLength <= 0 || interestRate <= 0){
                System.out.println("Error! You must take out a valid car loan.");

                } else if (downPayment > carLoan){
                    System.out.println("The car can be paid in full "); 

                } else { 
                    
                    int remainingBalance = carLoan - downPayment;
                    int months = loanLength * 12;   
                    int monthlyBalance = remainingBalance / months;
                    int interest = (monthlyBalance * interestRate) / 100;
                    int monthlyPayment = monthlyBalance + interest;
                    System.out.println("This is your monthly payment:" + monthlyPayment);



        }
    }

    

}