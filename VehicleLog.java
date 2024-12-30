import java.util.Date;

public class VehicleLog {
    private String vehicleId;
    private Vehicle vehicle;
    private String eventDescription ; // eg:-returned,maintenance,Rented;
    private Date timeStamp;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public VehicleLog(String vehicleId, Vehicle vehicle, String eventDescription, Date timeStamp){
        this.vehicleId=vehicleId;
        this.vehicle=vehicle;
        this.eventDescription=eventDescription;
        this.timeStamp=timeStamp;
    }


}
