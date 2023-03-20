import java.util.List;

public class PaymentProcessor {
    private List<PaymentMethod> paymentMethods;

    public PaymentProcessor(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void processPayment(double amount, String method) {
        for (PaymentMethod methodProcessor : paymentMethods) {
            if (methodProcessor.supports(method)) {
                methodProcessor.process(amount);
                return;
            }
        }
        throw new UnsupportedOperationException("Unsupported payment method: " + method);
    }

    private boolean supports(String method) {
        // implemented by each processor subclass
        return false;
    }

    private void process(double amount) {
        // implemented by each processor subclass
    }
}