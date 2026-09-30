package com.samar.brand.service;

import com.samar.brand.dto.BrandDto;

public interface BrandService {
    BrandDto getBrandByCode(String code);
}