public class Address {
    private String cityName;
    private String stateName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    private String zipCode;
    private String streetName;
    public Address(String cityName,String stateName,String zipCode,String streetName){
        this.cityName=cityName;
        this.stateName=stateName;
        this.zipCode=zipCode;
        this.streetName=streetName;
    }



}
