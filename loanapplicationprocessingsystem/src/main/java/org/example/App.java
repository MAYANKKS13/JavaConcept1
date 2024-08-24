package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        List<LoanApplication> list = new ArrayList<>();
        System.out.println("Enter loan applications (type 'exit' to stop):");
        while (true) {
            System.out.print("Credit Score: ");
            int creditscore = s.nextInt();
            System.out.print("Income: ");
            double income = s.nextDouble();
            System.out.print("Loan Amount: ");
            double loan = s.nextDouble();
            System.out.println();

            LoanApplication loanapplication = new LoanApplication(creditscore, income, loan);
            list.add(loanapplication);
            System.out.print("Would you like to continue? (yes/no): ");
            String ask = s.next();
            if(ask.equals("no") || ask.equals("NO")) {
                break;
            }
        }
        System.out.println();System.out.println();
        System.out.println("Loan Application Results: ");
        for (LoanApplication applicant: list) {
            boolean isApproval = applicant.isLoanApproval();
            if(isApproval) {
                System.out.println(applicant+ " - "+ "Approved");
            }
            else {
                System.out.println(applicant+ " - "+ "Rejected");
            }
        }


          s.close();









    }
}
