package com.smartbigthings.http.reciever.sigfox;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/sigfox")
public class reciever {

    @ApiOperation(value = "SigfoxDeviceDataPojo", notes = "recieves data input from SigFox Network with device information and device data for further processing")
    @PostMapping(path="/receiver" ,consumes="application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<SigfoxDeviceDataPojo> recieveSigfoxDeviceCommunication(@RequestBody SigfoxDeviceDataPojo deviceData) {
        System.out.println(deviceData.toString());
        return new ResponseEntity<>(deviceData, HttpStatus.OK);
    }

}