package tinsae.taxiapp;

/**
 * Ride ordering service uses factory method to order transport based on parameter provided
 * @author Kahsay Tinsae ghilay
 */
public class OrderRide {

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
            default -> new TaxiTransport();
        };
    }
}
