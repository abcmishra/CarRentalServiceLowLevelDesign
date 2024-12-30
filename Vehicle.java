abstract class Vehicle {
    private String vehicleID;
    private String model;
    private String licensePlate;
    private VehicleType vehicleType;
    private String manufacturer;
    private ParkingStall parkingStall;
    private  VehicleStatus vehicleStatus;
    public Vehicle(String vehicleID,String manufacturer,String licensePlate,VehicleType vehicleType,ParkingStall parkingStall,
                   VehicleStatus vehicleStatus){
        this.vehicleID=vehicleID;
        this.manufacturer=manufacturer;
        this.licensePlate=licensePlate;
        this.vehicleType=vehicleType;
        this.licensePlate=licensePlate;
        this.model=model;
        this.licensePlate=licensePlate;

    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ParkingStall getParkingStall() {
        return parkingStall;
    }

    public void setParkingStall(ParkingStall parkingStall) {
        this.parkingStall = parkingStall;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
