package tinsae;

import tinsae.taxiapp.BoatTransport;
import tinsae.taxiapp.CreditCardPayment;
import tinsae.taxiapp.TaxiOrderService;
import tinsae.taxiapp.Transport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // taxi transport service is a factory method pattern
        TaxiOrderService taxiOrderService = new TaxiOrderService();
        // taxi transport produces a Transport mode any kind of product that extends Transport
        Transport transport = taxiOrderService.getTransport("boat");
        // add a payment method (any kind that implements Payment)
        transport.setPayment(new CreditCardPayment());
        // run method in Transport is a Template method
        transport.run();

    }
}