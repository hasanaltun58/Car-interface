package com.example.demo.service.impl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hasanAltun
 */
@SpringBootTest
public class HatcbackServiceTest {

    @InjectMocks
    HatcbackService hatcbackService;


    @Test
    public void getTypeTest(){
        String carType = hatcbackService.getType();

        assertEquals("Hactback Car has produced.",carType);
    }
}