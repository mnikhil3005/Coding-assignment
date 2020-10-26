package com.assignment.task.service;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.RequestEntity.HeadersBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.assignment.task.model.ExternalClientResponse;

/** 
 *
 */
@Service
public class ExternalServiceClient {

    private static final Logger logger = LoggerFactory.getLogger(ExternalServiceClient.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${external.service.client.url}")
    private String externalServiceUrl;

    public ExternalClientResponse getAvailableSpace() {
        HeadersBuilder<?> headersBuilder = null;
        HttpHeaders headers = new HttpHeaders();

        headersBuilder = RequestEntity.get(URI.create(externalServiceUrl));
        headersBuilder.headers(headers);

        ResponseEntity<ExternalClientResponse> responseEntity = null;
        ParameterizedTypeReference<ExternalClientResponse> responseType = new ParameterizedTypeReference<ExternalClientResponse>() {
        };

        try {
            responseEntity = restTemplate.exchange(headersBuilder.build(), responseType);
        } catch (HttpClientErrorException | HttpServerErrorException ex) {
            // TODO
            logger.error("error occurrred");
            return new ExternalClientResponse(0);
        } catch (Exception ex) {
            String errorMsg = String.format("Error occurred.");
            logger.error(errorMsg, ex);
            throw new RuntimeException(errorMsg);
        }
        return responseEntity.getBody();
    }
}
