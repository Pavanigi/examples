package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.mentorentity.Mentor;
import com.example.mentorservice.MentorService;

@RestController
@RequestMapping("/mentors")
public class MentorController {

    @Autowired
    private MentorService mentorService;

    // Build save mentor REST API
    @PostMapping
    public ResponseEntity<Mentor> saveMentor(@RequestBody Mentor mentor){
        Mentor savedMentor = mentorService.saveMentor(mentor);
        return new ResponseEntity<>(savedMentor, HttpStatus.CREATED);
    }

    // Build get mentor rest api
    @GetMapping("/getByTranningCode/{tranningCode}")
    public ResponseEntity<Mentor> getMentor(@PathVariable String tranningCode){
        Mentor mentor = mentorService.getMentorById(tranningCode);
        return new ResponseEntity<>(mentor, HttpStatus.OK);
    }
}
