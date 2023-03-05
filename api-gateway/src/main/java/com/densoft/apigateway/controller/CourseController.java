package com.densoft.apigateway.controller;

import com.densoft.apigateway.request.CourseServiceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseServiceRequest courseServiceRequest;

    @PostMapping
    public ResponseEntity<?> saveCourse(@RequestBody Object course) {
        return new ResponseEntity<>(courseServiceRequest.saveCourse(course), HttpStatus.CREATED);
    }

    @DeleteMapping("{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable("courseId") Long courseId) {
        courseServiceRequest.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCourses(){
        return ResponseEntity.ok(courseServiceRequest.getAllCourses());
    }
}
