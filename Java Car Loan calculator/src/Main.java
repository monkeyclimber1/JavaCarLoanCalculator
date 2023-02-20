import java.util.Scanner;

public class Main {

    public static void carScanner() {
        double loan;
        double downPayment;
        double interestRate;
        double loanLife;
        try {

            Scanner loanAmount = new Scanner(System.in);
            System.out.println("Welcome to the Car Loan Calculator. ");
            Thread.sleep(1000);
            System.out.println("Type in your car loan amount");
            loan = loanAmount.nextDouble();
            System.out.println("Next, type in the down payment you are making on the vehicle");
            Scanner downPay = new Scanner(System.in);
            downPayment = downPay.nextDouble();
            Thread.sleep(1000);
            System.out.println("Type in the length of your loan in years. (The conversion to months will be done for you");
            Scanner loanLength = new Scanner(System.in);
            loanLife = loanLength.nextDouble();
            Thread.sleep(1000);
            System.out.println("Lastly, type in the interest rate you received");
            Scanner interestR = new Scanner(System.in);
            interestRate = interestR.nextDouble();
            Thread.sleep(1000);
            if (loanLife <= 0 || interestRate <=0) {
                System.out.println("Error! You must take out a valid car loan.");

            }
            else if(downPayment >= loan){
                System.out.println("The loan can be paid in full! You don't need this calculator?");
            }
            else{
                double remainingBalance = loan - downPayment;
                double months = (loanLife * 12);
                double monthlyBalance = (remainingBalance / months);
                double interest = (monthlyBalance * interestRate) / 100;
                double monthlyPayment = (monthlyBalance + interest);
                System.out.println(monthlyPayment);
            }


        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
    }
    public static void main(String[] args) {
        carScanner();

    }
}
