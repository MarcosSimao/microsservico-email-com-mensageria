package com.base.msemail.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.msemail.entites.Email;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmailRepository extends JpaRepository<Email, UUID>{

}
