package tinsae;
import tinsae.taxiapp.CreditCardPayment;
import tinsae.taxiapp.OrderRide;
import tinsae.taxiapp.PayPalPayment;
import tinsae.taxiapp.Transport;


public class Main {
    public static void main(String[] args) {

        System.out.println("++++++++++++++++++ NEW ORDER +++++++++++++++++++++++++++++");
        // taxi transport service is a factory method pattern
        OrderRide orderRide = new OrderRide();
        // taxi transport produces a Transport mode any kind of product that extends Transport
        Transport transport = orderRide.getTransport("boat");
        // add a payment method (any kind that implements Payment)
        transport.setPayment(new CreditCardPayment());
        // run method in Transport is a Template method
        transport.run();

        System.out.println("\n+++++++++++++++++++ ANOTHER ORDER ++++++++++++++++++++++++\n");

        // another ride
        OrderRide orderRide2 = new OrderRide();
        Transport transport2 = orderRide2.getTransport("Motor bike");
        transport2.setPayment(new PayPalPayment());
        transport2.run();

        System.out.println("\n+++++++++++++++++++ ANOTHER ORDER ++++++++++++++++++++++++\n");
        OrderRide orderRide3 = new OrderRide();
        Transport transport3 = orderRide3.getTransport("taxi");
        transport3.setPayment(new CreditCardPayment());
        transport3.run();

    }
}