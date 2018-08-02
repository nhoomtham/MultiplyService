package com.accenture.sample.multiply.controller;

import com.accenture.sample.multiply.model.ObjectResponse;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/mul")
public class MultiplyController {
    @RequestMapping(value = "/{x}/{y}", method = RequestMethod.GET)
    public ObjectResponse getMultiply(@PathVariable("x") Double x, @PathVariable("y") Double y, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        response.setData(x * y);

        return response;
    }
}
