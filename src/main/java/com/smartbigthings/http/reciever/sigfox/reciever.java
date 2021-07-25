package com.smartbigthings.http.reciever.sigfox;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/sigfox")
public class reciever {

    @ApiOperation(value = "UplinkDataPojo", notes = "receives data input from SigFox Network with device information and device data for further processing")
    @PostMapping(path="/data/uplinkdata" ,consumes="application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<UplinkDataPojo> recieveSigfoxDeviceCommunication(@RequestBody UplinkDataPojo uplinkdata) {
        return new ResponseEntity<>(uplinkdata, HttpStatus.OK);
    }

    @ApiOperation(value = "BidirDataPojo", notes = "receives data input from SigFox Network with device information and device data for further processing")
    @PostMapping(path="/data/bidir" ,consumes="application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<BidirDataPojo> recieveSigfoxDeviceCommunication(@RequestBody BidirDataPojo bidirdata) {
        return new ResponseEntity<>(bidirdata, HttpStatus.OK);
    }

    @ApiOperation(value = "StatusServicePojo", notes = "receives data input from SigFox Network with device information and device data for further processing")
    @PostMapping(path="/status/service" ,consumes="application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<StatusServicePojo> recieveSigfoxDeviceCommunication(@RequestBody StatusServicePojo statusdata) {
        return new ResponseEntity<>(statusdata, HttpStatus.OK);
    }

}