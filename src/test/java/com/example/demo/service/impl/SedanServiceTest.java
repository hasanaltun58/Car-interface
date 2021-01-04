package com.example.demo.service.impl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hasanAltun
 */

@SpringBootTest
public class SedanServiceTest {


    @InjectMocks
    SedanService sedanService;

    @Test
    public void getTypeTest(){
        String carType = sedanService.getType();

        assertEquals("Sedan Car has produced.",carType);
    }
}