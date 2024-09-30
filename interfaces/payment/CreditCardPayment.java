package interfaces.payment;

// Implementing the PaymentProcessor interface for credit card payments
class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    // Constructor
    public CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }

    @Override
    public String getName() {
        return "Credit Card";
    }
}

