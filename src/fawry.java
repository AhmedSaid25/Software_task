public class fawry implements PaymentCompany{

    @Override
    public double getServseFees() {
        return 10d;
    }

    @Override
    public double pay(double amount) {
        return amount+getServseFees();
    }
}
