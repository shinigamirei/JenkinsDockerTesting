package com.qa.mariadb;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Account, Integer> {
 
}
