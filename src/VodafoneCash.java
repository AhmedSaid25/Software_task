public class VodafoneCash implements PaymentCompany{

    @Override
    public double getServseFees() {
        return 5;
    }

    @Override
    public double pay(double amount) {
        return amount+getServseFees();
    }
}
