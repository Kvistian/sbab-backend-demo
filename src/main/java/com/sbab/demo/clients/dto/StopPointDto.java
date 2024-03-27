package com.sbab.demo.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StopPointDto {
    private Integer id;
    private Long gid;
    @JsonProperty("pattern_point_gid")
    private Long patternPointGid;
    private String name;
    @JsonProperty("sname")
    private String sName;
    private String designation;
    @JsonProperty("local_num")
    private Integer localNum;
    private String type;
    @JsonProperty("has_entrance")
    private Boolean hasEntrance;
    private String lat;
    private String lon;
    @JsonProperty("door_orientation")
    private String doorOrientation;
    @JsonProperty("transport_authority")
    private TransportAuthorityDto transportAuthority;
    @JsonProperty("stop_area")
    private StopAreaDto stopArea;
    private ValidityDto valid;
}
