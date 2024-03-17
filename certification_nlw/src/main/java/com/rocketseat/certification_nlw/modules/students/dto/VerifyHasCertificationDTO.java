package com.rocketseat.certification_nlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyHasCertificationDTO {

    private String email;
    private String technology;

    public String getEmail() {
        return email;
    }

    public String getTechnology() {
        return technology;
    }
}
