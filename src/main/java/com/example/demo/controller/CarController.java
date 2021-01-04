package com.example.demo.controller;

import com.example.demo.service.CarService;
import com.example.demo.service.impl.CabrioService;
import com.example.demo.service.impl.HatcbackService;
import com.example.demo.service.impl.SedanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hasanAltun
 */

@RestController
public class CarController {

    private static final String SEDAN = "sedan";
    private static final String CABRIO = "cabrio";
    private static final String HATCBACK = "hatcback";

    @Autowired
    private CabrioService cabrioService;

    @Autowired
    private SedanService sedanService;

    @Autowired
    private HatcbackService hatcbackService;



    @GetMapping("/get-car")
    private @ResponseBody String getCar(@RequestParam("carType") String carType){
        CarService carService = getCarServiceMap().get(carType);

        return carService.getType();
    }

    private Map<String, CarService> getCarServiceMap(){
        Map<String, CarService> carServiceMap  = new HashMap<String, CarService>() {{
            put(CABRIO,cabrioService );
            put(SEDAN, sedanService);
            put(HATCBACK, hatcbackService);
        }};

        return carServiceMap;
    }
}
