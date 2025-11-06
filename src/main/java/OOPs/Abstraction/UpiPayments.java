package OOPs.Abstraction;
//child class
public class UpiPayments extends PaymentService{
    public UpiPayments(double amount) {super(amount);}

    @Override
    public boolean pay(){
        System.out.println("Upi payment method: "+amount);
        return true;
    }

}
