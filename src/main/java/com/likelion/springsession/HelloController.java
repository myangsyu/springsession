package com.likelion.springsession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "안녕하세요, " + name + "님!";
    }

    @GetMapping("/hello-json")
    public HelloResponse helloJson() {
        return new HelloResponse("Hello, Spring!", 200);
    }
}

class HelloResponse {
    private final String message;
    private final int code;

    public HelloResponse(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() { return message; }
    public int getCode() { return code; }
}


