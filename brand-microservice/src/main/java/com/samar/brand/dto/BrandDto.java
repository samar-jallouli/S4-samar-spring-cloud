package com.samar.brand.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDto {
    private Long id;
    private String brandName;
    private String brandCode;
}