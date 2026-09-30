package com.samar.makeup.service;

import com.samar.makeup.dto.APIResponseDto;

public interface MakeupService {
    APIResponseDto getMakeupById(Long id);
}