/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer.Transaction.persistence.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.customer.Transaction.model.Profile;

/**
 *
 * @author gino
 */
public interface BookRepository extends CrudRepository<Profile, Long> {

    List<Profile> findByTitle(String title);

    Optional<Profile> findOne(long id);
}
