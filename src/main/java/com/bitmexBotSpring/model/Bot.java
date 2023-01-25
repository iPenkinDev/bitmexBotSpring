package com.bitmexBotSpring.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bot {
    private String apiKey;
    private String apiSecret;
    private double step;
    private int level;
    private double coef;
}
