package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient p){
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(p.getId().toString());
        dto.setName(p.getName());
        dto.setAddress(p.getAddress());
        dto.setEmail(p.getEmail());
        dto.setDateOfBirth(p.getDateOfBirth().toString());
        return dto;
    }
}
