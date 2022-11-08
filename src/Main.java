import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PaymentCompany paymentCompany= null;
        Calculation calculation = null;
        System.out.println("fawry or vodafone");
        System.out.println("Enter 1. for fawry");
        System.out.println("Enter 2. for vodafone");

        Scanner cin = new Scanner(System.in);
        double money= cin.nextDouble() ;
        int opt = cin.nextInt();
        if(opt ==1 )paymentCompany = new fawry();
        else paymentCompany = new VodafoneCash();
        System.out.println("which payment method");
        System.out.println("Enter 1. for NoInstallment");
        System.out.println("Enter 2. for SixMonthes");
        System.out.println("Enter 3. for Twilve");
        opt = cin.nextInt();
        if(opt==1)calculation = new NoTnstallment();
        else if(opt ==2 )calculation = new SixMonth();
        else  calculation = new TwilveMonth();

        Billing billing = new Billing();
        System.out.println("Which Delivery method");
        System.out.println("Enter 1. for runner");
        System.out.println("Enter 2. for dirvetheow");
        opt = cin.nextInt();


       double ans=  billing.checkOut(calculation,paymentCompany,money,opt);
        System.out.println("You should pay " + ans);

    }
}
