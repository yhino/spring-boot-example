package com.example.welcome;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.io.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController
{
    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String welcome(Member member)
    {
        return "welcome";
    }

    @RequestMapping(value="/hello", method=RequestMethod.POST)
    public String hello(@Valid Member member, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            return "welcome";
        }

        return "hello";
    }
}
