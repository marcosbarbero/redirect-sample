package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

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
    public View redirect() {
        return new RedirectView("index.html");
    }
}
