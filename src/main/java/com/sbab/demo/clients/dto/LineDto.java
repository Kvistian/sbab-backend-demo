package com.sbab.demo.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineDto {
    private Integer id;
    private Long gid;
    private String name;
    private String designation;
    @JsonProperty("transport_mode")
    private String transportMode;
    @JsonProperty("group_of_lines")
    private String groupOfLines;
    @JsonProperty("transport_authority")
    private TransportAuthorityDto transportAuthority;
    private ContractorDto contractor;
    private ValidityDto valid;
}
