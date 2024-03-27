package com.myproject.reactivemongo.model;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private String id;

    @Size(min = 3, max = 255)
    private String customerName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}