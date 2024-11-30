package tinsae.taxiapp;

/**
 * @author Kahsay Tinsae Ghilay
 * Transport base class
 */

public abstract class Transport {

    private Payment payment;

    Transport(){

    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment() {
        return payment;
    }

    /**
     * template method run calls the necessary steps for the transport to complete
     */
    public void run(){
        transport();
        acceptPayment();
    }
    /**
     * transport method is an abstract method that can be overridden by subclasses
     */
    abstract void transport();

    /**
     * this is not needed to be overridden
     */
    private void acceptPayment(){
        try{
            this.payment.pay();
        }catch (NullPointerException e){
            System.out.println("Payment not accepted: " + e.getMessage());
        }
    }
}
