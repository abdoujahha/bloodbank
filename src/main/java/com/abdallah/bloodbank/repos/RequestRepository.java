package com.abdallah.bloodbank.repos;

import com.abdallah.bloodbank.entities.Patient;
import com.abdallah.bloodbank.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Integer> {

    public void deleteByPatient(Patient patient);

    public Request findByPatient(Patient patient);


}
