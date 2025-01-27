package com.example.carRentalEsiee.controllers;

import com.example.carRentalEsiee.models.Car;
import com.example.carRentalEsiee.models.CarDates;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CarRentalService {
    Logger logger = LoggerFactory.getLogger(CarRentalService.class);
    @GetMapping("/bonjour")
    public String hello() {
        return "hello";
    }
    @PutMapping(value = "/cars/{plateNumber}") public void rent(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent,
            @RequestBody CarDates dates){

        logger.info("Plate number:" + plateNumber);
        logger.info("Rent: " + rent);
        logger.info("Dates: " + dates);
    }

}
