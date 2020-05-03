package com.example.bitcoin.service;

import com.example.bitcoin.entity.Big;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitService {
    public Big getApi() throws JsonProcessingException {

        final String url = "https://blockchain.info/ticker";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Big big = objectMapper.readValue(result, Big.class);
        return big;
    }

}
