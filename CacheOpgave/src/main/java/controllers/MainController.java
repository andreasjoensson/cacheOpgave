package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

@GetMapping("/forside")
@ResponseBody
public String sigHej(){
    return "hej";
}
}
