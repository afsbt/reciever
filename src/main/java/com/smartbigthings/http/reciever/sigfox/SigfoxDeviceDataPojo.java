package com.smartbigthings.http.reciever.sigfox;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

public class SigfoxDeviceDataPojo {

    private Timestamp recievedTimestamp;
    @ApiModelProperty(value="The Device Name, send by ", required = true)
    private String device;
    private Integer time;
    private Integer seqNumber;
    private String deviceTypeId;
    private Float snr;
    private String rssi;
    private String station;
    private Map<?,?> DeviceData;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(Integer seqNumber) {
        this.seqNumber = seqNumber;
    }

    public Timestamp getRecievedTimestamp() {
        return recievedTimestamp;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Float getSnr() {
        return snr;
    }

    public void setSnr(Float snr) {
        this.snr = snr;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Map<?, ?> getDeviceData() {
        return DeviceData;
    }

    public void setDeviceData(Map<?, ?> deviceData) {
        DeviceData = deviceData;
    }

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public SigfoxDeviceDataPojo(String device, Float snr, String rssi, String station, Integer time, String deviceTypeId, Map<?, ?> deviceData, Integer seqNumber) {
        this.device = device;
        this.snr = snr;
        this.rssi = rssi;
        this.station = station;
        this.DeviceData = deviceData;
        this.time = time;
        this.deviceTypeId = deviceTypeId;
        this.seqNumber = seqNumber;
        this.recievedTimestamp = Timestamp.valueOf(LocalDateTime.now());
    }
}
