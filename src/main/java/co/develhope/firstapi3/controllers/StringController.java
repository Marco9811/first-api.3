package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StringController {

    @GetMapping("/strings")
    public String getStrings(@RequestParam(required = true) String firstString,
                             @RequestParam(required = false) String secondString) {
        if (secondString == null) {
            return firstString;
        } else {
            return firstString + " " + secondString;
        }
    }
}