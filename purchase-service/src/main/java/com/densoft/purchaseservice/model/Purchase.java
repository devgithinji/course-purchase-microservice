package com.densoft.purchaseservice.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "course_id", nullable = false)
    private Long courseId;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "price", nullable = false)
    private Double price;
    @CreationTimestamp
    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
}
