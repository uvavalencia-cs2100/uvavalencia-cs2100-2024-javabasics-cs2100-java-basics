package interfaces.payment;


// Define the PaymentProcessor interface
public interface PaymentMethod {
    void pay(double amount);
    String getName();
}
