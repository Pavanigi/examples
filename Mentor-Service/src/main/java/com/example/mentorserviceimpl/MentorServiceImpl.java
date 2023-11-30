package com.example.mentorserviceimpl;

import com.example.mentorentity.Mentor;
import com.example.mentorservice.MentorService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MentorServiceImpl implements MentorService {

    private final RestTemplate restTemplate;

    @Value("${http://tranning-microservice-url/tranning}")
    private String tranningServiceUrl; // Set the URL in your application properties

    public MentorServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Mentor saveMentor(Mentor mentor) {
        return restTemplate.postForObject(tranningServiceUrl + "/mentors", mentor, Mentor.class);
    }

    @Override
    public Mentor getMentorById(String code) {
        return restTemplate.getForObject(tranningServiceUrl + "/mentors/getByTranningCode/{tranningCode}", Mentor.class, code);
    }
}
