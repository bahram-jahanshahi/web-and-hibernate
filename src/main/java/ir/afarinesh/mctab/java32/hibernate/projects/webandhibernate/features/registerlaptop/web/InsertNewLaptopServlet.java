package ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.web;

import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.InsertNewLaptopUseCase;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.commands.InsertNewLaptopCommand;
import ir.afarinesh.mctab.java32.hibernate.projects.webandhibernate.features.registerlaptop.usecases.impl.InsertNewLaptopUseCaseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertNewLaptopServlet")
public class InsertNewLaptopServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        InsertNewLaptopUseCase insertNewLaptopUseCase = new InsertNewLaptopUseCaseImpl();
        Laptop laptop = insertNewLaptopUseCase.insert(
                new InsertNewLaptopCommand(title)
        );
        System.out.println(laptop);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
