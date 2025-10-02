package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel, color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.odometerReading = odometerReading;
        this.color = color;
        this.price = price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public String getColor() {
        return color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "" +
                "vehicleId=" + vehicleId +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price;
    }
}
