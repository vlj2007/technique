package ru.isands.technique.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.isands.technique.entity.ComputerEntityModel;
import ru.isands.technique.service.ComputerService;

@RestController
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

//    @PostMapping
//    public ResponseEntity<ComputerEntityModel> createComputerEntityModel(@RequestBody ComputerEntityModel computerEntityModel) {
//        return ResponseEntity.ok(computerEntityModel.createComputerEntityModel(computerEntityModel));
//    }







}
