package model;

public class Gadgets {
    protected int gadgetId;
    protected String gadgetName;
    protected double gadgetPrice;
    protected String imageUrl;
    protected int quantity;
    protected String details;

    public int getgadgetId() {
        return gadgetId;
    }

    public String getgadgetName() {
        return gadgetName;
    }

    public double getgadgetPrice() {
        return gadgetId;
    }

    public String getimageUrl() {
        return imageUrl;
    }

    public int getquantity() {
        return quantity;
    }

    public String getdetails() {
        return details;
    }

    public void setgadgetName(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    public void setgadgetId(int gadgetId) {
        this.gadgetId = gadgetId;
    }

    public void setgadgetPrice(Double gadgetPrice) {
        this.gadgetPrice = gadgetPrice;
    }

    public void setimageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public void setdetails(String details) {
        this.details = details;
    }

}