package com.ruffy.MyFirstSpringBoot.classes;

import org.springframework.stereotype.Component;

import java.io.*;


//@Component
public class RestService {
    private final File file = new File("C:\\Users\\user\\Desktop\\Java-Resources\\MyFirstSpringBoot\\src\\main\\java\\com\\ruffy\\MyFirstSpringBoot\\classes\\list");

    // Method to post to file
    public String postToFile(String string){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(file, true))){
            writer.write(string +"\n");
            return "Item saved successfully";
        } catch (IOException e){
            System.out.println(e.getMessage());
            return "Name saved successfully";
        }
    }

    // Method to read from file
    public String readFromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            StringBuilder builder = new StringBuilder();
            while((line = reader.readLine()) != null){
                builder.append(line);
            }
            return  builder.toString();
        } catch (IOException e){
            System.out.println(e.getMessage());
            return "Cannot read from file";
        }
    }
}
