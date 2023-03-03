package com.densoft.courseservice.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "title", length = 100, nullable = false)
    private String title;
    @Column(name = "subtitle", length = 100, nullable = false)
    private String subtitle;
    @Column(name = "price", nullable = false)
    private Double price;
    @CreationTimestamp
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;
}
