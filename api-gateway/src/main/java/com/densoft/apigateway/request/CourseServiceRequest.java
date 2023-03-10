package com.densoft.apigateway.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "course-service", path = "api/course", configuration = FeignConfiguration.class)
public interface CourseServiceRequest {
    @PostMapping
    Object saveCourse(@RequestBody Object requestBody);

    @DeleteMapping("{courseId}")
    void deleteCourse(@PathVariable("courseId") Long courseId);

    @GetMapping
    List<Object> getAllCourses();
}
