package com.fireStation.model;

import java.util.Objects;

public class FireStaion {

    private String address;
    private String station;

    public FireStaion() {
    }

    public FireStaion(String address, String station) {

        this.address = address;
        this.station = station;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "FireStaion{" +
                ", address='" + address + '\'' +
                ", station='" + station + '\'' +
                '}';
    }

}
