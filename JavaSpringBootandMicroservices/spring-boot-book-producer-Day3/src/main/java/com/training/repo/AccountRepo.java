package com.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
