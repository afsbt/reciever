package com.smartbigthings.http.reciever.sigfox;


import java.sql.Timestamp;
import java.time.LocalDateTime;

public class StatusServicePojo {

    private Timestamp recievedTimestamp;

    private Integer time;
    private String device;
    private Integer seqNumber;
    private Float snr;
    private Float rssi;
    private String station;
    private Float batt;
    private Float temp;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(Integer seqNumber) {
        this.seqNumber = seqNumber;
    }

    public Float getSnr() {
        return snr;
    }

    public void setSnr(Float snr) {
        this.snr = snr;
    }

    public Float getRssi() {
        return rssi;
    }

    public void setRssi(Float rssi) {
        this.rssi = rssi;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Float getBatt() {
        return batt;
    }

    public void setBatt(Float batt) {
        this.batt = batt;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public StatusServicePojo(Integer time, String device, Integer seqNumber, Float snr, Float rssi, String station, Float batt, Float temp) {
        this.time = time;
        this.device = device;
        this.seqNumber = seqNumber;
        this.snr = snr;
        this.rssi = rssi;
        this.station = station;
        this.batt = batt;
        this.temp = temp;
        this.recievedTimestamp = Timestamp.valueOf(LocalDateTime.now());
    }
}
