package com.samar.makeup.restControllers;

import com.samar.makeup.dto.APIResponseDto;
import com.samar.makeup.service.MakeupService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/makeups")
@AllArgsConstructor
public class MakeupController {

    private MakeupService makeupService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getMakeupById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(makeupService.getMakeupById(id), HttpStatus.OK);
    }
}