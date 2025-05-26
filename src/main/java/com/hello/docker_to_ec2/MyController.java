package com.hello.docker_to_ec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping(value = "/hello", produces = "application/json")
    public Map<String, Object> getEmployee() {
        Map<String, Object> emp = new HashMap<>();
        emp.put("id", 101);
        emp.put("name", "John Doe");
        emp.put("age", 30);
        return emp; // this will return emd data
    }
}
