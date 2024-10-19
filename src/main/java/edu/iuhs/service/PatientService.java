package edu.iuhs.service;

import edu.iuhs.dto.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient();

    void addPatient(Patient patient);


}
