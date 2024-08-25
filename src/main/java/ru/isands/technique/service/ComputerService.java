package ru.isands.technique.service;

import org.springframework.stereotype.Service;
import ru.isands.technique.api.IComputer;
import ru.isands.technique.entity.ComputerEntityModel;

@Service
public class ComputerService implements IComputer {

    public final ComputerEntityModel computerEntityModel;

    public ComputerService(ComputerEntityModel computerEntityModel) {
        this.computerEntityModel = computerEntityModel;
    }

//        public ComputerEntityModel createComputerEntityModel (){
//        }




}
