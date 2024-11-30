package tinsae.taxiapp;

/**
 * Payment with PayPal
 * @author Kahsay Tinsae Ghilay
 */
public class PayPalPayment implements Payment {
    /**
     * Pay method
     */
    @Override
    public void pay() {
        System.out.println("Payment with PayPal completed");
    }
}
