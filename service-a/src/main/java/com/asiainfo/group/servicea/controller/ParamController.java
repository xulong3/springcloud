package com.asiainfo.group.servicea.controller;

import com.asiainfo.group.servicea.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param")
public class ParamController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/baseParam",method = RequestMethod.GET)
    public String baseParam(String name,int age){
        return "The name is:"+name+",the age is:"+age;
    }

    @RequestMapping(value = "/objectParam",method = RequestMethod.POST)
    public String objectParam(@RequestBody User user,@RequestParam("desc") String desc){
        return "The name is:"+user.getUsername()+",the age is:"+user.getAge()+",the password is:"+user.getPassword()+",the desc is:"+desc;
    }


}
