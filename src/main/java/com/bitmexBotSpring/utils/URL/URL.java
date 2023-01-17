package com.bitmexBotSpring.utils.URL;

import lombok.Data;
import lombok.experimental.UtilityClass;

@Data
@UtilityClass
public class URL {
    private String protocol;
    private String net;
    private String baseUrl;
    private String apiPath = UtilURL.API_PATH;
    private String resourcePath;

}
