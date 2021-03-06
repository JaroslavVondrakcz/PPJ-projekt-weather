package com.weather.weather.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="city")
public class CityMySQL {

    //@Column(name="cityName")
    @Id
    @Column(name="cityName")
    String cityName;

    @Transient
    List<CityMg> cities;
    @Transient
    float averageTemp;

    public float getAverageTemp() {
        return averageTemp;
    }

    public CityMySQL(String cityName, List<CityMg> cities, float averageTemp) {
        this.cityName = cityName;
        this.cities = cities;
        this.averageTemp = averageTemp;
    }

    public void setAverageTemp(float averageTemp) {
        this.averageTemp = averageTemp;
    }

    public List<CityMg> getCities() {
        return cities;
    }

    public void setCities(List<CityMg> cities) {
        this.cities = cities;
    }

    public CityMySQL(String cityName) {
        this.cityName = cityName;
    }

    public CityMySQL() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
