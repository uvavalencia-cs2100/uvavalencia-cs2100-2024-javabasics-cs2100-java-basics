package interfaces.payment;

// Implementing the PaymentProcessor interface for PayPal payments
class PayPalPayment implements PaymentMethod {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // Constructor
    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

    @Override
    public String getName() {
        return "PayPal";
    }
}
