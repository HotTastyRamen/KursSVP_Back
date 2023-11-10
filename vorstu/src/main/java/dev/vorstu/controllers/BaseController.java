package dev.vorstu;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/base")
public class BaseController {
    @GetMapping("check")
    public String getAllUsers(){
        return "Hello world" + new Date();
    }
}
