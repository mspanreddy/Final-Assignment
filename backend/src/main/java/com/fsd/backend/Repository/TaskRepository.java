package com.fsd.backend.Repository;

import org.springframework.data.repository.CrudRepository;

import com.fsd.backend.Entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
