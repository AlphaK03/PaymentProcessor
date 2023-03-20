public interface PaymentMethod {
    boolean supports(String method);
    void process(double amount);
}