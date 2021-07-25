package com.smartbigthings.http.reciever.sigfox;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.Map;

public class BidirDataPojo {

    private Timestamp receivedTimestamp;
    @ApiModelProperty(value="The Device Name, send by ", required = true)
    private String device;
    @ApiModelProperty(value="Epoch time in seconds, The event timestamp (in seconds since the Unix Epoch)", required = true)
    private Integer time;
    @ApiModelProperty(value="The sequence number of the message if available", required = true)
    private Integer seqNumber;
    @ApiModelProperty(value="in hexadecimal, up to 24 characters, Device Type identifier (in hexadecimal – up to 8 characters <=> 4 bytes)", required = true)
    private String deviceTypeId;
    @ApiModelProperty(value="two maximum fraction digits, The signal to noise ratio (in dB – Float value with two maximum fraction digits) Condition: for devices with contract option NETWORK METADATA", required = false)
    private Float snr;
    @ApiModelProperty(value="two maximum fraction digits, The RSSI (in dBm – Float value with two maximum fraction digits). If there is no data to be returned, then the value is null. Condition: for devices with contract option NETWORK METADATA", required = false)
    private Float rssi;
    @ApiModelProperty(value="Station as String in hexadecimal, 4 characters, The base station identifier (in hexadecimal – 4 characters <=> 2 bytes) Condition: for devices with contract option NETWORK METADATA", required = false)
    private String station;
    @ApiModelProperty(value="The Device Name, send by ", required = true)
    private Map<?,?> DeviceData;
    @ApiModelProperty(value="True if device support long poling mechanism for downlink (required compatible device) ", required = true)
    private boolean longPolling;
    @ApiModelProperty(value="True if this message needs to be acknowledged, false else.) ", required = true)
    private boolean ack;


}
