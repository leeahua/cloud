package com.me.eureka.consumer.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.util.Assert;

/**
 * The class O auth 2 feign request interceptor.
 *
 * @author yangyong
 * @date 2019-02-13
 */
@Slf4j
public class MyOAuth2FeignRequestInterceptor implements RequestInterceptor {
    private static final String BEARER_TOKEN_TYPE = "bearer";

    private final OAuth2RestTemplate oAuth2RestTemplate;

    /**
     * Instantiates a new O auth 2 feign request interceptor.
     *
     * @param oAuth2RestTemplate the o auth 2 rest template
     */
    MyOAuth2FeignRequestInterceptor(OAuth2RestTemplate oAuth2RestTemplate) {
        Assert.notNull(oAuth2RestTemplate, "Context can not be null");
        this.oAuth2RestTemplate = oAuth2RestTemplate;
    }

    /**
     * Apply.
     *
     * @param template the template
     */
    @Override
    public void apply(RequestTemplate template) {
        log.debug("Constructing Header {} for Token {}", HttpHeaders.AUTHORIZATION, BEARER_TOKEN_TYPE);
        template.header(HttpHeaders.AUTHORIZATION, String.format("%s %s", BEARER_TOKEN_TYPE,
                oAuth2RestTemplate.getAccessToken().toString()));
    }
}
