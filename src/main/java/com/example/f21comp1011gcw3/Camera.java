package com.example.f21comp1011gcw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Camera {
    private String make;
    private String model;
//    private ArrayList<String> lenses;
    private double megaPixels;
    private double price;
    private boolean digital;
    private boolean mirrorless;
    private int cameraId;
    private int unitsSold;

    public Camera(String make, String model, double megaPixels, double price, boolean digital, boolean mirrorless) {
        setMake(make);
        setModel(model);
        setMegaPixels(megaPixels);
        setPrice(price);
        setDigital(digital);
        setMirrorless(mirrorless);
        setUnitsSold(0);
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        if (unitsSold>=0)
            this.unitsSold = unitsSold;
        else
            throw new IllegalArgumentException("units sold must be greater than or equal to 0");
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        if (cameraId>0)
            this.cameraId = cameraId;
        else
            throw new IllegalArgumentException("camera ID must be greater than 0");
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        List<String> validManufacturers = Arrays.asList("Canon","Nikon","Sony","Mitsubishi","FujiFilm");
        if (validManufacturers.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException(String.format("%s is invalid, choose from %s",make,
                    validManufacturers));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public ArrayList<String> getLenses() {
//        return lenses;
//    }
//
//    public void setLenses(ArrayList<String> lenses) {
//        this.lenses = lenses;
//    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be greater than 0");
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public boolean isMirrorless() {
        return mirrorless;
    }

    public void setMirrorless(boolean mirrorless) {
        this.mirrorless = mirrorless;
    }

    public String toString()
    {
//        return make + " " + model + " $" + price;
        return String.format("%d-%s %s $%.2f",cameraId, make, model, price);
    }
}
