package com.sbab.demo.services;

import com.sbab.demo.clients.TrafikLabClient;
import com.sbab.demo.clients.dto.LinesResponseDto;
import com.sbab.demo.clients.dto.ValidityDto;
import com.sbab.demo.services.domain.Line;
import com.sbab.demo.services.domain.StopPoint;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TrafikLabServiceImpl implements TrafikLabService {
    private final TrafikLabClient client;
    private final ModelMapper modelMapper;

    @Autowired
    public TrafikLabServiceImpl(TrafikLabClient client, ModelMapper modelMapper) {
        this.client = client;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StopPoint> getStops() {
        return client.getStops().stream()
                .filter(stopPoint -> isValid(stopPoint.getValid()))
                .map(stopPoint -> modelMapper.map(stopPoint, StopPoint.class))
                .toList();
    }

    @Override
    public List<Line> getBusLines() {
        LinesResponseDto lines = client.getLines();
        return lines.getBus().stream()
                .filter(line -> isValid(line.getValid()))
                .map(line -> modelMapper.map(line, Line.class))
                .toList();
    }

    private boolean isValid(ValidityDto validity) {
        Date now = new Date();
        Date from = validity.getFrom();
        Date to = validity.getTo();
        return from != null && from.before(now) && to == null || to.after(now);
    }
}
