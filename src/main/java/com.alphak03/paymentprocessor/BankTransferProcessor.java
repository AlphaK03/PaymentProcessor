

public class BankTransferProcessor implements PaymentMethod {
    @Override
    public boolean supports(String method) {
        return "banktransfer".equals(method);
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing payment of " + amount + " with bank transfer.");
        // implementation details for processing payment with bank transfer
    }
}