package com.cts.sba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.sba.model.Task;

/**
 * This TaskRepository is an interface which extends JpaRepository and perfroms
 * crud operation.
 * 
 * @author Prasad Penchala
 * @version 1.0
 * @since
 *
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
