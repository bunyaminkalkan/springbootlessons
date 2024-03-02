package com.bunyaminkalkan.controller;

import com.bunyaminkalkan.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class HelloController {

    //localhost:8080/api/hello
    //@GetMapping(path = "hello")
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }


    @PostMapping("/save")
    public String save(){
        return "Data saved";
    }


    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted";
    }


    @GetMapping("/message/{m}")
    public String getMyMessage(@PathVariable("m") String message){
        return "Your message is : " + message;
    }


    @GetMapping("/message2")
    public String getMyMessage2(@RequestParam String message){
        return "Your message is: " + message;
    }


    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        System.out.println("User Saved");
        user.setPassword("");
        return user;
    }


    @PostMapping("/users")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All Users Saved");
        users.forEach(user -> user.setPassword(""));
        return users;
    }


    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : " + myHeader;
    }

}
