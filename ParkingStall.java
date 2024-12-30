class ParkingStall {
    String stallNumber;
    String locationIdentifier; // Branch or area

    public ParkingStall(String stallNumber, String locationIdentifier) {
        this.stallNumber = stallNumber;
        this.locationIdentifier = locationIdentifier;
    }

    public String getStallNumber() {
        return stallNumber;
    }

    public void setStallNumber(String stallNumber) {
        this.stallNumber = stallNumber;
    }

    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    public void setLocationIdentifier(String locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }
}
