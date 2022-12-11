package com.example.periodicals.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SourceDto {
    private long id;
    private String path;
    private String name;
    private String description;
}
