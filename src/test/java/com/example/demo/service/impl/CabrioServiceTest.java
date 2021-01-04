package com.example.demo.service.impl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hasanAltun
 */

@SpringBootTest
public class CabrioServiceTest {

    @InjectMocks
    CabrioService cabrioService;

    @Test
    public void getTypeTest(){
        String carType = cabrioService.getType();

        assertEquals("Cabrio Car has produced.",carType);
    }
}