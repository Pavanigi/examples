package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Tranning;
import com.example.service.TranningService;

@Service
public class TranningServiceImpl implements TranningService {

    @Autowired
    private RestTemplate restTemplate;

    private final String mentorMicroserviceUrl = "http://mentor-microservice-url/mentors"; // Replace with the actual URL of your mentor microservice

    @Override
    public Tranning getbyTranningcode(Tranning tranning) {
        // Assuming you have an endpoint in the mentor microservice to get mentor details by training code
        String mentorEndpoint = mentorMicroserviceUrl + "/mentors/getByTranningCode/{tranningCode}";
        return restTemplate.getForObject(mentorEndpoint, Tranning.class, tranning.getTranningcode());
    } 
}
