package com.traini8.controller;

import com.traini8.model.TrainingCenter;
import com.traini8.service.TrainingCenterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        return ResponseEntity.ok(service.saveTrainingCenter(trainingCenter));
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}
