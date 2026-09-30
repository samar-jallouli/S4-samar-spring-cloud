package com.samar.makeup.service;

import com.samar.makeup.dto.APIResponseDto;
import com.samar.makeup.dto.BrandDto;
import com.samar.makeup.dto.MakeupDto;
import com.samar.makeup.entities.Makeup;
import com.samar.makeup.repos.MakeupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MakeupServiceImpl implements MakeupService {

    private MakeupRepository makeupRepository;
    private APIClient apiClient;

    @Override
    public APIResponseDto getMakeupById(Long id) {
        Makeup makeup = makeupRepository.findById(id).get();

        BrandDto brandDto = apiClient.getBrandByCode(makeup.getBrandCode());

        MakeupDto makeupDto = new MakeupDto(
                makeup.getId(),
                makeup.getMakeupName(),
                makeup.getMakeupType(),
                makeup.getBrandCode(),
                brandDto.getBrandName()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setMakeupDto(makeupDto);
        apiResponseDto.setBrandDto(brandDto);

        return apiResponseDto;
    }
}