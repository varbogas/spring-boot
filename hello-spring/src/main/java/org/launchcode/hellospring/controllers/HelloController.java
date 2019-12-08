package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    //lives at hello/goodbye
//    @GetMapping("/goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    @RequestMapping(value = "/form/result", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, String language) {

        return getMessage(name, language);
    }

    //lives at hello/name
//    @GetMapping("/form/{name}")
//    public String helloWithPathParam(@PathVariable String name){
//
//        return "Hello, " + name + "!";
//    }


    //lives at hello/form
    @GetMapping("/")
    public String helloForm(){
               return  "<html>" +
                        "<body>" +
                        "<form action = '/form' method = 'post'>" +
                        "<input type = 'text' name = 'name' />" +
                        "<select name='language'>" +
                        "<option value='English'>English</option>"  +
                        "<option value='French'>French</option>"  +
                        "<option value='Italian'>Italian</option>"  +
                        "<option value='Japanese'>Japanese</option>"  +
                        "<option value='Spanish'>Spanish</option>"  +
                        "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" + "</html>";
    }

    public static String getMessage(String name, String language) {
        if (language.equals("English")) {
            return "Hello, " + name + "!";
        } else if (language.equals("French")) {
            return "Bonjour, " + name + "!";
        } else if (language.equals("Italian")) {
            return "Ciao, " + name + "!";
        } else if (language.equals("Japanese")) {
            return "Konbanwa, " + name + "!";
        } else {
            return "Hola, " + name + "!";
        }
    }
}

