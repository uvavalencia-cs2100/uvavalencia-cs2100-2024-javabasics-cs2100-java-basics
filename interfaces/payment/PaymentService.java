package interfaces.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentService {
    private final List<PaymentMethod> paymentMethods;

    public PaymentService() {
        this.paymentMethods = new ArrayList<>();
    }

    public void registerPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    public void processPayment(String methodName, double amount) {
        Optional<PaymentMethod> method = paymentMethods.stream()
            .filter(pm -> pm.getName().equalsIgnoreCase(methodName))
            .findFirst();

        if (method.isPresent()) {
            method.get().pay(amount);
        } else {
            System.out.println("Payment method " + methodName + " not found.");
        }
    }

    public void listPaymentMethods() {
        System.out.println("Available Payment Methods:");
        paymentMethods.forEach(pm -> System.out.println(" - " + pm.getName()));
    }
}
