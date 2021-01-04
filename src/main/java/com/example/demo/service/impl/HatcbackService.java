package com.example.demo.service.impl;

import com.example.demo.service.CarService;
import org.springframework.stereotype.Service;

/**
 * @author hasanAltun
 */
@Service
public class HatcbackService implements CarService {
    @Override
    public String getType() {
        return "Hactback Car has produced.";
    }
}
