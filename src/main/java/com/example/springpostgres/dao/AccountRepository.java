package com.example.springpostgres.dao;

import com.example.springpostgres.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("select a from Account a where a.userId >= :userId")
    List<Account> findAllWithFilteredUserId(
            @Param("userId") Integer userId);
}
