package com.fireStation.model;

import java.util.Objects;

public class FireStaion {

    private Integer id;
    private String adress;
    private String station;

    public FireStaion() {
    }

    public FireStaion(Integer id, String adress, String station) {
        this.id = id;
        this.adress = adress;
        this.station = station;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", station='" + station + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FireStaion that = (FireStaion) o;
        return Objects.equals(id, that.id) && Objects.equals(adress, that.adress) && Objects.equals(station, that.station);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adress, station);
    }
}
