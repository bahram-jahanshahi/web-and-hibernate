package ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.repositories;

import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.config.hibernate.repositories.CrudRepository;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;

public class LaptopRepository extends CrudRepository<Laptop, Long> {

    private static LaptopRepository laptopRepository;

    @Override
    public Class<Laptop> getEntityClass() {
        return Laptop.class;
    }

    private LaptopRepository() {

    }

    public static LaptopRepository getInstance() {
        if (laptopRepository == null) {
            laptopRepository = new LaptopRepository();
        }
        return laptopRepository;
    }
}
