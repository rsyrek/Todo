package com.capgemini.todo.services;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
	public String showTask(String name) {
        return "I have to do that: "+name;
    }
}
