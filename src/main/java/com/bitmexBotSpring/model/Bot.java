package com.bitmexBotSpring.model;

import lombok.Data;

@Data
public class Bot {
    private String apiKey;
    private String apiSecret;
    private double step;
    private int level;
    private double coef;
}
