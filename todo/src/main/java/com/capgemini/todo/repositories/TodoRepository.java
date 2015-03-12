package com.capgemini.todo.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.todo.entities.Todo;

@Repository
@Transactional(readOnly = true)
public class TodoRepository {
	@PersistenceContext
    private EntityManager em;

    public List<Todo> findAll() {
        return em.createQuery("select u from Todo u", Todo.class).getResultList();
    }
}
