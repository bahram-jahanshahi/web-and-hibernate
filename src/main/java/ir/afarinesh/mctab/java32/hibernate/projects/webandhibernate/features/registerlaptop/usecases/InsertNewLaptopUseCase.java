package ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases;

import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.config.annotations.UseCase;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.commands.InsertNewLaptopCommand;

@UseCase
public interface InsertNewLaptopUseCase {

    Laptop insert(InsertNewLaptopCommand command);
}
