public class DeliveryOptions {
    DelivaryFees deliverOptions(int option){
        DelivaryFees delivaryFees = null;
        if(option ==1)delivaryFees= new Runner();
        else delivaryFees = new DriveThrow();
        return delivaryFees;
    }
}