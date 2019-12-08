package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

    @Controller
    @ResponseBody
    @RequestMapping("/")
    public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>" +
                "</html>";
    }


        @RequestMapping(value = "/form/results", method = {RequestMethod.GET, RequestMethod.POST})
        @ResponseBody
        public String hello(@RequestParam(defaultValue = "Languages") String name,
                            @RequestParam(defaultValue = "JavaScript") String plang,
                            @RequestParam(defaultValue = "Java") String plang2,
                            @RequestParam(defaultValue = "Python") String plang3) {

            return "<h1>" + name + "</h1>\n" +
                    "<h3><ol>" +
                    "<li>" + plang +" </li> " +
                    "<li>" + plang2 +" </li> " +
                    "<li>" + plang3 +" </li> " +
                    "</ol></h3>";

        }

        //lives at hello/form
        @GetMapping("/form")
        public String helloForm(){
            return  "<html>" +
                    "<body>" +
                    "<p>Name: </p>" +
                    "<form action = '/form/results' method = 'post'>" +
                    "<input type = 'text' name = 'name' />" +
                    "<p>My favorite language: </p>" +
                    "<select name='plang'>" +
                    "<option value='Java'>Java</option>"  +
                    "<option value='Javascript'>Javascript</option>"  +
                    "<option value='Python'>Python</option>"  +
                    "</select>" +
                    "<p>My second favorite language: </p>" +
                    "<select name='plang2'>" +
                    "<option value='Java'>Java</option>"  +
                    "<option value='Javascript'>Javascript</option>"  +
                    "<option value='Python'>Python</option>"  +
                    "</select>" +
                    "<p>My third favorite language: </p>" +
                    "<select name='plang3'>" +
                    "<option value='Java'>Java</option>"  +
                    "<option value='Javascript'>Javascript</option>"  +
                    "<option value='Python'>Python</option>"  +
                    "</select>" + "<br>"+
                    "<input type = 'submit' value = 'Submit' />" + "<br>" +
                    "</form>" +
                    "</body>" + "</html>";
        }

        public static String getMessage(String name, String plang) {
            if (plang.equals("Java")) {
                return name + "Java";
            } else if (plang.equals("Javascript")) {
                return name + "Javascript";
            } else {
                return name + "Python";
            }
        }
    }
