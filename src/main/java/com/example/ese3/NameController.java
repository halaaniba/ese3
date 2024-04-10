package com.example.ese3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reversename")
    public String getReversedName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return reversedName.toString();
    }
}

