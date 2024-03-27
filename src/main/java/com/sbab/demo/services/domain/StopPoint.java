package com.sbab.demo.services.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StopPoint {
    private Integer id;
    private Long gid;
    private String name;
}
