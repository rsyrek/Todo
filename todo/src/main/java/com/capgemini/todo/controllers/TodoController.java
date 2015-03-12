package com.capgemini.todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.todo.services.TaskService;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
	
	@Autowired
    private TaskService taskService;

    @RequestMapping(value = "/find/{name}")
    @ResponseBody
    public String findUser(@PathVariable String name) {
        return taskService.showTask(name);
    }
}
