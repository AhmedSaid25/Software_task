import java.util.Scanner;

public abstract class Calculation {
    public double input(){
        System.out.println("Enter the amount of money");
        Scanner cin = new Scanner(System.in);
        double money= cin.nextDouble() ;
        return money;
    }
    abstract public double CalInterset(double money);

}
