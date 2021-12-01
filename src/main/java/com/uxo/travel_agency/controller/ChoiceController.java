package com.uxo.travel_agency.controller;

import com.uxo.travel_agency.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;

}
