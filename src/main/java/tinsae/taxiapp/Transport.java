package tinsae.taxiapp;

/**
 * @author Kahsay Tinsae Ghilay
 * Transport base class
 */

abstract class Transport {

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
     * template method transport can be implemented in sub classes
     */
    public void run(){
        transport();
        acceptPayment();
    }
    /**
     * transport method
     */
    abstract void transport();

    public void acceptPayment(){
        this.payment.pay();
    };
}
