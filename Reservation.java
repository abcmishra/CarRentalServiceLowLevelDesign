import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private String reservationID;
    private Vehicle vehicle;
    private Date pickupDate;
    private Date  reservationDate;
    private ReservationStatus reservationStatus;
    private double lateFee;
    private User user;
    private Date dueDate;

    private List<AddittionalServices> additionalServicesList;
    public Reservation(String reservationId, Vehicle vehicle, User user, Date reservationDate,
                       Date pickupDate, Date dueDate, ReservationStatus reservationStatus,List<AddittionalServices> addittionalServicesList) {
        this.reservationID = reservationId;
        this.vehicle = vehicle;
        this.user = user;
        this.reservationDate = reservationDate;
        this.pickupDate = pickupDate;
        this.dueDate = dueDate;
        this.reservationStatus = reservationStatus;
        this.additionalServicesList= new ArrayList<>();
    }

    public void cancelReservation() {
        this.status = ReservationStatus.CANCELLED;
    }

    public void addLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public void addAdditionalService(AddittionalServices service) {
        additionalServicesList.add(service);
    }
}

}
