import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> paymentMethods = new ArrayList<>();
        paymentMethods.add(new CreditCardProcessor());
        paymentMethods.add(new PayPalProcessor());
        paymentMethods.add(new BankTransferProcessor());

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethods);
        paymentProcessor.processPayment(100.0, "creditcard");
        paymentProcessor.processPayment(50.0, "paypal");
        paymentProcessor.processPayment(200.0, "banktransfer");
    }
}