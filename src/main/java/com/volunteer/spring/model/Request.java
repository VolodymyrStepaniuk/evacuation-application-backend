package com.volunteer.spring.model;

import com.volunteer.spring.model.enums.EvacuationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EvacuationType evacuationType;
    private String description;
    @ManyToOne
    @JoinTable(
            name = "person_request",
            joinColumns = @JoinColumn(name = "request_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private Person person;
    @ManyToOne
    @JoinTable(
            name = "request_markers",
            joinColumns = @JoinColumn(name = "request_id"),
            inverseJoinColumns = @JoinColumn(name = "marker_id")
    )
    private Marker marker;
    private LocalDateTime time = LocalDateTime.now();
}
