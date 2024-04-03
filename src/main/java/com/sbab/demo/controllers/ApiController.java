package com.sbab.demo.controllers;

import com.sbab.demo.controllers.dto.LineDto;
import com.sbab.demo.controllers.dto.StopPointDto;
import com.sbab.demo.services.TrafikLabService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final TrafikLabService trafikLabService;
    private final ModelMapper modelMapper;

    @Autowired
    public ApiController(TrafikLabService trafikLabService, ModelMapper modelMapper) {
        this.trafikLabService = trafikLabService;
        this.modelMapper = modelMapper;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/stops")
    public List<StopPointDto> getStops() {
        return trafikLabService.getStops().stream()
                .filter(stop -> stop.getGid() % 5 == 0)
                .map(stop -> modelMapper.map(stop, StopPointDto.class))
                .toList()
                .subList(0, 10);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/lines")
    public List<LineDto> getLines() {
        return trafikLabService.getBusLines().stream()
                .filter(line -> line.getGid() % 3 == 0)
                .map(line -> modelMapper.map(line, LineDto.class))
                .toList()
                .subList(0, 10);
    }
}
