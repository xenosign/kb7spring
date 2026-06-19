package org.example.kb7spring.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String name;
    private String role;
    private String specialty;
    private String status;
}
