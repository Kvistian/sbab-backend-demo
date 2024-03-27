package com.sbab.demo.clients.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinesResponseDto {
    private List<LineDto> metro;
    private List<LineDto> tram;
    private List<LineDto> train;
    private List<LineDto> bus;
    private List<LineDto> ship;
    private List<LineDto> ferry;
    private List<LineDto> taxi;
}
