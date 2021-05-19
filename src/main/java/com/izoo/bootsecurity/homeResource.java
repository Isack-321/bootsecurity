package com.izoo.bootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class HomeResource {

    @GetMapping("/")
    public String anyuser(){
        return("<h1>hello</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h2>hello user </h2>");
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h3>hello Admin</h3>";
    }

}
