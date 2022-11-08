import java.util.Scanner;

public class Billing {
    double checkOut(Calculation calculation,PaymentCompany paymentCompany,double money,int opt){
        double total  = calculation.CalInterset(money);
        double theHoleMoney = paymentCompany.pay(total);
        DeliveryOptions deliveryOptions = new DeliveryOptions() ;
        DelivaryFees delivaryFees  = deliveryOptions.deliverOptions(opt);
        return theHoleMoney+delivaryFees.getFess();
    }
}
