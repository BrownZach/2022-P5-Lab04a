// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonths  = numYears * 12;
        double monthlyRate = annualRate / 100 / 12;
        double monthlyPay = ((monthlyRate * (Math.pow((1+monthlyRate),numMonths)))/((Math.pow((1+monthlyRate),numMonths)) - 1)) * principal;
        double totalPay = monthlyPay * numMonths;
        double totalInterest = totalPay - principal;
        monthlyPay = Math.round(monthlyPay * 100) / 100.0;
        totalPay = Math.round(totalPay * 100) / 100.0;
        totalInterest = Math.round(totalInterest * 100) /100.0;
        System.out.println("Principal:        $" + principal);
        System.out.println("Annual Rate:      " + annualRate + "%");
        System.out.println("Number of Years   " + numYears);
        System.out.println("Monthly Payment:  $" + monthlyPay);
        System.out.println("Total Pay:        $" + totalPay);
        System.out.println("Total Interest:   $" + totalInterest);
    }
}

