

public class CreditCardProcessor implements PaymentMethod {
    @Override
    public boolean supports(String method) {
        return "creditcard".equals(method);
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing payment of " + amount + " with credit card.");
        // implementation details for processing payment with credit card
    }
}