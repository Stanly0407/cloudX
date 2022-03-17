package com.cloud.sv.controllers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.regions.internal.util.EC2MetadataUtils;

import java.util.Map;


@RestController
@RequestMapping("cloud")
public class ApplicationController {

    private static final Logger LOGGER = LogManager.getLogger(ApplicationController.class);


    @GetMapping
    public String greeting(Map<String, Object> model) {
        LOGGER.info("CloudX project start successfully");
        String EC2InstanceRegion = EC2MetadataUtils.getEC2InstanceRegion();
        String availabilityZone = EC2MetadataUtils.getAvailabilityZone();
        return "EC2InstanceRegion: \n" + EC2InstanceRegion + "\n AvailabilityZone: " + availabilityZone;
    }
}
