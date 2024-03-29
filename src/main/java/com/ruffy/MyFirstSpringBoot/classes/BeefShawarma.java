package com.ruffy.MyFirstSpringBoot.classes;

import com.ruffy.MyFirstSpringBoot.interfaces.Shawarma;
import org.springframework.stereotype.Component;

@Component
public class BeefShawarma implements Shawarma {
    @Override
    public void serveShawarma() {
        System.out.println("This is Beef shawarma from Ingryd");
    }

    @Override
    public Shawarma get() {
        return new BeefShawarma();
    }
}
