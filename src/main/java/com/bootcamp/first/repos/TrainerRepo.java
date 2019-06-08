/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.first.repos;

import com.bootcamp.first.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Makis
 */
@Repository
public interface TrainerRepo  extends JpaRepository<Trainer,Integer> {
    
}
