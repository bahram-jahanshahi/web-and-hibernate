package ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.test;

import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.repositories.LaptopRepository;

import java.util.List;

public class TestLaptopRepository {
    public static void main(String[] args) {

        LaptopRepository laptopRepository = LaptopRepository.getInstance();
        Laptop laptop = new Laptop(null, "Lenovo ideapad #78001");
        laptopRepository.save(laptop);

        laptopRepository
                .findAll()
                .stream()
                .forEach(System.out::println);

        laptopRepository
                .findAll(0, 2)
                .stream()
                .forEach(System.out::println);

        laptopRepository
                .deleteById(3L);

        laptopRepository
                .findAll()
                .stream()
                .forEach(System.out::println);

    }
}
