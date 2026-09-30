package com.samar.makeup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MakeupDto {
    private Long id;
    private String makeupName;
    private String makeupType;
    private String brandCode;
    private String brandName;
}