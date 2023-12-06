package com.abdallah.bloodbank.service;

import com.abdallah.bloodbank.repos.BloodStockRepository;
import com.abdallah.bloodbank.repos.RequestRepository;
import com.abdallah.bloodbank.entities.Patient;
import com.abdallah.bloodbank.entities.Request;
import com.abdallah.bloodbank.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService{
    @Autowired
    RequestRepository requestRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    BloodStockRepository bloodStockRepository;

    @Override
    public Request saveRequest(Request request) {
        Request R = requestRepository.findByPatient(request.getPatient());
        if(R==null){
            return requestRepository.save(request);
        }
        return request;
    }

    @Override
    public void deleteRequestById(int idrequest) {
        requestRepository.deleteById(idrequest);
    }

    @Override
    public Request getRequestById(int idrequest) {
        return requestRepository.findById(idrequest).get();
    }


    @Override
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    @Override
    public Request updateRequest(Request request) {
        return requestRepository.save(request);
    }

    @Override
    public void deleteByPatient(int idpatient) {
        Patient patient = patientRepository.findById(idpatient).get();
        requestRepository.deleteByPatient(patient);

    }
}
