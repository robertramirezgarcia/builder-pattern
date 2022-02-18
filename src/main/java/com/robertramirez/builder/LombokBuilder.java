package com.robertramirez.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LombokBuilder {
    private Long id;
    private String name;
}

