package com.samar.brand.service;

import com.samar.brand.dto.BrandDto;
import com.samar.brand.entities.Brand;
import com.samar.brand.repos.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public BrandDto getBrandByCode(String code) {
        Brand brand = brandRepository.findByBrandCode(code);
        return new BrandDto(
                brand.getId(),
                brand.getBrandName(),
                brand.getBrandCode()
        );
    }
}