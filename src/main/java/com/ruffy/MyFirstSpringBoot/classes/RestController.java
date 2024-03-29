package com.ruffy.MyFirstSpringBoot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    List<String> postRequests = new ArrayList<>();

//    @Autowired
//    private  RestService restService;
    private final RestService restService;

    public RestController(RestService service) {
        this.restService = service;
    }
//    @GetMapping("/name")
//    public String getUserName(){
//        return "Ruffy Sanni";
//    }

    // Getting a single name
//    public List<String> getUserName(){
//        return postRequests;
//    }
    @GetMapping("/name")
    public String getUserName(){

        return restService.readFromFile();
    }


    // Posting a name
    // Using RequestBody
//    @PostMapping("/name")
//    public BufferedWriter postUserName(@RequestBody String name) throws IOException {
//        File file = new File("C:\\Users\\user\\Desktop\\Java-Resources\\MyFirstSpringBoot\\src\\main\\java\\com\\ruffy\\MyFirstSpringBoot\\classes\\list");
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//
//        try{
////            BufferedWriter bufferedWriter = null;
//
//            bufferedWriter.write(String.valueOf(postRequests.add(name)));
//        } catch( IOException e){
//            e.getMessage();
//        }
//        return  bufferedWriter;
//    }
    @PostMapping("/name")
    public String postUserName(@RequestBody String name){
        return  restService.postToFile(name);
    }



    // Using a request parameter
//    @PostMapping("/name")
//    public void postUserName(@RequestParam String name){
//        postRequests.add(name);
//    }

    // Using path variable
//    @PostMapping("/name/{name}")
//    public void postUserName(@PathVariable String name){
//        postRequests.add(name);
//    }

    // Fetching all names
    @GetMapping("/names")
    public List<String> getAllNames(){
//        for(int i=0; i< postRequests.size(); i++){
//            postRequests.get(i);
//        }
        return postRequests;
    }

    // Deleting a name
    @DeleteMapping
    public void deleteName(String name){
        postRequests.remove(name);
    }

    // Updating a Name

    public String updateName(String name){
        return  postRequests.set(1, name);
    }
}
