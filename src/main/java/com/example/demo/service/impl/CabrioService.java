package com.example.demo.service.impl;

import com.example.demo.service.CarService;
import org.springframework.stereotype.Service;

/**
 * @author hasanAltun
 */

@Service
public class CabrioService implements CarService {
    @Override
    public String getType() {
        return "Cabrio Car has produced.";
    }
}
