package com.densoft.courseservice.controller;


import com.densoft.courseservice.model.Course;
import com.densoft.courseservice.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/course")
@RequiredArgsConstructor
public class CourseRestController {
    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<?> saveCourse(@RequestBody Course course) {
        System.out.println(course);
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllCourses() {
        return ResponseEntity.ok(courseService.findAllCourses());
    }

    @DeleteMapping("{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable("courseId") Long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
