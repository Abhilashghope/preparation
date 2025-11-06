package OOPs.Abstraction;

public class CODPayments extends PaymentService{
    public CODPayments(double amount) {super(amount);
    }

    @Override
    public boolean pay() {
        System.out.println("COD payment method: " + amount);
        return true;
    }
}
