package com.kalpita.TemperatureConverter;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class TemperatureConverterController {

    private final TemperatureConverterService service;

    public TemperatureConverterController(TemperatureConverterService service) {
        this.service = service;
    }

    // Endpoint 1: Celsius → Fahrenheit
    @GetMapping("/celtofah/{c}")
    public String celToFah(@PathVariable double c) {
        return service.celToFah(c);
    }

    // Endpoint 2: Fahrenheit → Celsius
    @GetMapping("/fahtocel/{f}")
    public String fahToCel(@PathVariable double f) {
        return service.fahToCel(f);
    }
}