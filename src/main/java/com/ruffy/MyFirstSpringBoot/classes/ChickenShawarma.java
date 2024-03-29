package com.ruffy.MyFirstSpringBoot.classes;

import com.ruffy.MyFirstSpringBoot.interfaces.Shawarma;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class ChickenShawarma implements Shawarma {
    @Override
    public void serveShawarma() {
        System.out.println("This is Chicken shawarma from Ingryd.");
    }

    @Override
    public Shawarma get() {
        return new ChickenShawarma();
    }
}
