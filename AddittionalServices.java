public class AddittionalServices {
    private  String serviceID;
    private String servicName;
    private double price;

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServicName() {
        return servicName;
    }

    public void setServicName(String servicName) {
        this.servicName = servicName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private int qty;

    public AddittionalServices(String serviceID,String servicName,double price,int qty){
        this.serviceID=serviceID;
        this.servicName=servicName;
        this.price=price;
        this.qty=qty;
    }




}
