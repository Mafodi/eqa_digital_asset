package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

    public Map<String, String> defaultHeaders() {
        Map<String, String> defaultHeaders = new HashMap<String, String>();
        defaultHeaders.put("Content-Type", "application/json");

        return defaultHeaders;
    }

    public Map<String, String> headersWitHBearerToken() {
        Map<String, String> headersWitHBearerToken = new HashMap<String, String>();
        headersWitHBearerToken.put("Authorization", "Bearer <tokenvalue>");
        headersWitHBearerToken.put("Content-Type", "application/json");

        return headersWitHBearerToken;
    }

}
