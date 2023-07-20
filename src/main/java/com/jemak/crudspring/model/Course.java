package com.jemak.crudspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(length = 15, nullable = false)
  private String category;

  // public Course(Long id, String name, String category) {
  // this.id = id;
  // this.name = name;
  // this.category = category;
  // }
}
