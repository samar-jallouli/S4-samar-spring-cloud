package com.samar.makeup.service;

import com.samar.makeup.dto.BrandDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "BRAND")
@FeignClient(name = "BRAND")
public interface APIClient {

    @GetMapping("api/brands/{brand-code}")
    BrandDto getBrandByCode(@PathVariable("brand-code") String brandCode);
}