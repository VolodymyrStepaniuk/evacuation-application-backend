package com.volunteer.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "marker")
public class Marker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double longitude;
    private double latitude;
}
