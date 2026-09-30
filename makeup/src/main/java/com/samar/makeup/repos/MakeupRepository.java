package com.samar.makeup.repos;

import com.samar.makeup.entities.Makeup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeupRepository extends JpaRepository<Makeup, Long> {
}