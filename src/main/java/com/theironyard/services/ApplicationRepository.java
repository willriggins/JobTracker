package com.theironyard.services;

import com.theironyard.entities.Application;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by will on 6/24/16.
 */
public interface ApplicationRepository extends CrudRepository<Application, Integer> {
    public Iterable<Application> findByUser(User user);
    public Iterable<Application> findById(int id);

}
