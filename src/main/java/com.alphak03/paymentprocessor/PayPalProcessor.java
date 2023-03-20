

public class PayPalProcessor implements PaymentMethod {
    @Override
    public boolean supports(String method) {
        return "paypal".equals(method);
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing payment of " + amount + " with PayPal.");
        // implementation details for processing payment with PayPal
    }
}
