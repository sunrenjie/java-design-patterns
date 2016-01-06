package com.iluwatar.layers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * CURD repository for cake bottom
 */
@Repository
public interface CakeBottomDao extends CrudRepository<CakeBottom, Long> {

}