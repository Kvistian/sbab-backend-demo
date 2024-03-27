package com.sbab.demo.clients.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidityDto {
    private Date from;
    private Date to;
}
