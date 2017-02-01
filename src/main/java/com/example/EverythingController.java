package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Marcos Barbero
 * @since 2017-02-01
 */
@Controller
public class EverythingController {

    @GetMapping("/forward")
    public String forward() {
        return "forward:/index.html";
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/index.html";
    }
}
