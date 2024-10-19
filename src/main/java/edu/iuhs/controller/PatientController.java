package edu.iuhs.controller;

import edu.iuhs.dto.Patient;
import edu.iuhs.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService service;


    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return service.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient){
        service.addPatient(patient);
    }

}
