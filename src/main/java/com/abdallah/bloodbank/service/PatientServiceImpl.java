package com.abdallah.bloodbank.service;


import com.abdallah.bloodbank.entities.Patient;
import com.abdallah.bloodbank.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public void deletePatientById(int idpatient) {
        patientRepository.deleteById(idpatient);
    }

    @Override
    public Patient getPatientById(int idpatient) {
        return patientRepository.findById(idpatient).get();
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> findByName(String name) {
        return patientRepository.findByName(name);
    }



    @Override
    public List<Patient> findByBloodGroup(String bloodGroup) {
        return patientRepository.findByBloodGroup(bloodGroup);
    }


    @Override
    public int countAllBy() {
        return patientRepository.countAllBy();
    }




}


