package com.ruffy.MyFirstSpringBoot.classes;


import com.ruffy.MyFirstSpringBoot.interfaces.Shawarma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShawarmaController {

    @Autowired
    private Shawarma shawarma;

    public void serveShawarma(){
        shawarma.serveShawarma();
    }
}
