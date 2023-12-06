package com.abdallah.bloodbank.service;


import com.abdallah.bloodbank.entities.Patient;

import java.util.List;

public interface PatientService {
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient patient);
    void deletePatient(Patient patient);
    void deletePatientById(int idpatient);
    Patient getPatientById(int idpatient);
    List<Patient> getAllPatients();
    List<Patient> findByName(String name);

    List<Patient> findByBloodGroup(String bloodGroup);

    int countAllBy();




}

