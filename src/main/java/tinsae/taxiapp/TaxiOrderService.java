package tinsae.taxiapp;

public class TaxiOrderService {

    /**
     * Factory method to order a certain type of transport
     * @param transport type of transport ordered
     * @return Transport
     * @see Transport
     */
    public Transport getTransport(String transport) {
        return switch (transport.toLowerCase()) {
            case "boat" -> new BoatTransport();
            case "motor bike" -> new MotorBikeTransport();
            default -> null;
        };
    }
}
