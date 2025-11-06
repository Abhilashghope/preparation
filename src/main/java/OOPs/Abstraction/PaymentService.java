package OOPs.Abstraction;

//Parent abstract class
public abstract class PaymentService {
    protected double amount;
    public PaymentService(double amount) {  this.amount = amount; }
    // must be implemented by child class
    public abstract boolean pay();

    public void generateReceipt() {
        System.out.println("Amount of payment is " + amount);
    }

}
