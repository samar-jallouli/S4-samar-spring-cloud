package com.samar.brand.repos;

import com.samar.brand.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    Brand findByBrandCode(String code);
}