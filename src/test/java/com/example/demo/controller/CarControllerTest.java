package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author hasanAltun
 */

@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnSedanCarMessageWhenCarTypeEqualsSedan() throws Exception {
        this.mockMvc.perform(get("/get-car?carType=sedan")).andDo(print()).andExpect(status().isOk()).andExpect(content().string("Sedan Car has produced."));
    }

    @Test
    public void shouldReturnCabrioCarMessageWhenCarTypeEqualsCabrio() throws Exception {
        this.mockMvc.perform(get("/get-car?carType=cabrio")).andDo(print()).andExpect(status().isOk()).andExpect(content().string("Cabrio Car has produced."));
    }

    @Test
    public void shouldReturnHatcbackCarMessageWhenCarTypeEqualsHatcback() throws Exception {
        this.mockMvc.perform(get("/get-car?carType=hatcback")).andDo(print()).andExpect(status().isOk()).andExpect(content().string("Hactback Car has produced."));
    }
}