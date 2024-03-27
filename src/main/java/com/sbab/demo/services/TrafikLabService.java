package com.sbab.demo.services;

import com.sbab.demo.services.domain.Line;
import com.sbab.demo.services.domain.StopPoint;

import java.util.List;

public interface TrafikLabService {
    List<StopPoint> getStops();
    List<Line> getBusLines();
}
