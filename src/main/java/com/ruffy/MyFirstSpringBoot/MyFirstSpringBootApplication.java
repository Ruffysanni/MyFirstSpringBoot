package com.ruffy.MyFirstSpringBoot;

import com.ruffy.MyFirstSpringBoot.classes.BeefShawarma;
import com.ruffy.MyFirstSpringBoot.classes.ShawarmaController;
import com.ruffy.MyFirstSpringBoot.interfaces.Shawarma;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MyFirstSpringBootApplication.class, args);
		ShawarmaController controller = applicationContext.getBean(ShawarmaController.class);
		controller.serveShawarma();

		Shawarma shawarma = applicationContext.getBean(BeefShawarma.class);
		shawarma.serveShawarma();

	}
}
