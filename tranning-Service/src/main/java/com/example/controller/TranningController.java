package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Tranning;
import com.example.service.TranningService;

@RestController
@RequestMapping("/tranning")

public class TranningController {
	
	@Autowired
    private TranningService tranningService;

    @GetMapping("/getByTranningCode/{tranningCode}")
    public Tranning getByTranningCode(@PathVariable String tranningCode) {
        Tranning tranning = new Tranning();
        tranning.setTranningcode(tranningCode);
        return tranningService.getbyTranningcode(tranning);
    }

}
