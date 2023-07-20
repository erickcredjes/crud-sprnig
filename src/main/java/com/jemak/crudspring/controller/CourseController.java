package com.jemak.crudspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jemak.crudspring.model.Course;
import com.jemak.crudspring.repository.CourseRepository;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

  private final CourseRepository _courseRepository;

  public CourseController(CourseRepository courseRepository) {
    this._courseRepository = courseRepository;
  }

  @GetMapping
  public List<Course> getAll() {
    return this._courseRepository.findAll();
  }

  @PostMapping
  public ResponseEntity<Course> create(@RequestBody Course course) {
    Course item = this._courseRepository.save(course);
    if (item != null)
      return new ResponseEntity<Course>(course, HttpStatus.OK);

    return new ResponseEntity<Course>(course, HttpStatus.NOT_FOUND);
  }

}
