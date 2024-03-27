package com.sbab.demo.clients;

import com.sbab.demo.clients.dto.LinesResponseDto;
import com.sbab.demo.clients.dto.StopPointDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "trafiklab-client",
        url = "${feign.client.config.trafiklab.url}")
public interface TrafikLabClient {
    @RequestMapping(method = RequestMethod.GET, value = "/v1/stop-points", consumes = "application/json")
    List<StopPointDto> getStops();
    @RequestMapping(method = RequestMethod.GET, value = "/v1/lines?transport_authority_id=1", consumes = "application/json")
    LinesResponseDto getLines();
}
