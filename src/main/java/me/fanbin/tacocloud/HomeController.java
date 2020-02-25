package me.fanbin.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fanbin
 * @date 2020/2/25
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
