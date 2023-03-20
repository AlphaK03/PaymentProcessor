import java.util.List;

public class PaymentProcessor {
    private List<PaymentProcessor> paymentProcessors;

    public PaymentProcessor(List<PaymentProcessor> paymentProcessors) {
        this.paymentProcessors = paymentProcessors;
    }

    public void processPayment(double amount, String method) {
        for (PaymentProcessor processor : paymentProcessors) {
            if (processor.supports(method)) {
                processor.process(amount);
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