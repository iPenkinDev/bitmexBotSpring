package com.bitmexBotSpring.utils.URL;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.UtilityClass;


public class URL {
    @Setter
    @Getter
    private String protocol;
    @Setter
    @Getter
    private String net;
    @Setter
    @Getter
    private String baseUrl;
    @Setter
    @Getter
    private String apiPath = UtilURL.API_PATH;
    @Setter
    @Getter
    private String resourcePath;


    @Override
    public String toString() {
        return protocol + net + baseUrl + apiPath + resourcePath;
    }
}

