package ru.isands.technique.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.isands.technique.entity.Model;
import ru.isands.technique.service.ComputerService;

@RestController
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }





}
