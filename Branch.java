import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String branchId;
    private String branchName;
    private Address address;
    List<Vehicle> vehicleList;
    public Branch(String branchId,String branchName,Address address){
        this.branchId=branchId;
        this.branchName=branchName;
        this.address=address;
        this.vehicleList=new ArrayList<>();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }




    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String vehicleId) {
        vehicleList.removeIf(vehicle -> vehicle.getVehicleID().equals(vehicleId));
    }
}
