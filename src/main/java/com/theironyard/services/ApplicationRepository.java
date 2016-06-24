package com.theironyard.services;

import com.theironyard.entities.Application;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by will on 6/24/16.
 */
public interface ApplicationRepository extends CrudRepository<Application, Integer> {
}
