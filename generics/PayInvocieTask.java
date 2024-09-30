package generics;

// Task: PayInvoiceTask
class PayInvoiceTask extends Task {
    private long invocidId;
    private double invoiceAmount;

    public PayInvoiceTask(long invocidId, double invoiceAmount) {
        super("PAY_INVOICE");
        this.invocidId = invocidId;
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public void execute() {
        System.out.println("Pay Invoice (" + invocidId + ") of " + invoiceAmount + " USD if there is enogh balance");
        System.out.println("Executing task: " + getName() + " - Processing invoice payment.");
    }
}
