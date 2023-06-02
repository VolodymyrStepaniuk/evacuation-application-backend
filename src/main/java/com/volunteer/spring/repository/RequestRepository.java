package com.volunteer.spring.repository;

import com.volunteer.spring.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Long> {
}
