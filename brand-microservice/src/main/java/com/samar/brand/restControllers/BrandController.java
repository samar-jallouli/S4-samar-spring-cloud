package com.samar.brand.restControllers;

import com.samar.brand.dto.BrandDto;
import com.samar.brand.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandController {

    private BrandService brandService;

    @GetMapping("{code}")
    public ResponseEntity<BrandDto> getBrandByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(brandService.getBrandByCode(code), HttpStatus.OK);
    }
}