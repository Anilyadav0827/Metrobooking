public class MetroTecketBooking {
    private String destination;
    private String seatNo;

    @java.lang.Override
    public String toString() {
        return "MetroTecketBooking{" +
                "destination='" + destination + '\'' +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }

    public MetroTecketBooking(String destination, String seatNo) {
        this.destination = destination;
        this.seatNo = seatNo;
    }
}