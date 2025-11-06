package OOPs.polymorphism;

import OOPs.Abstraction.PaymentService;

public class UpiPaymentsService implements RunTimePolymorphism {

    @Override
    public void ProcessPayment(){
        System.out.println("Processing UPI Payment");
    }
}
