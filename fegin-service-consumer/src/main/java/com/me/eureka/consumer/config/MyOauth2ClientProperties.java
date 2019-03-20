package com.me.eureka.consumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The class Oauth 2 client properties.
 *
 * @author yangyong
 * @date 2019-02-13
 */
@Data
@ConfigurationProperties(prefix = "autopai.oauth2.client")
public class MyOauth2ClientProperties {
    private String id;
    private String accessTokenUrl;
    private String clientId;
    private String clientSecret;
    private String clientAuthenticationScheme;
}

