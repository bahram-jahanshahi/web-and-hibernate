package ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.impl;

import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.config.annotations.Service;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.InsertNewLaptopUseCase;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.commands.InsertNewLaptopCommand;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.repositories.LaptopRepository;

@Service
public class InsertNewLaptopUseCaseImpl implements InsertNewLaptopUseCase {
    @Override
    public Laptop insert(InsertNewLaptopCommand command) {
        LaptopRepository laptopRepository = LaptopRepository.getInstance();
        return laptopRepository.save(
                new Laptop(null, command.getTitle())
        );

    }
}
