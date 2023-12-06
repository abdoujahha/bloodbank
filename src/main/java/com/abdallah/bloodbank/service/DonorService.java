package com.abdallah.bloodbank.service;

import com.abdallah.bloodbank.entities.Donor;

import java.util.List;

public interface DonorService {
    Donor saveDonor(Donor donor);
    Donor updateDonor(Donor donor);
    void deleteDonor(Donor donor);
    void deleteDonorById(int iddonor);
    Donor getDonorById(int iddonor);
    List<Donor> getAllDonors();
    List<Donor> findByName(String name);
    List<Donor> findByBloodGroup(String bloodGroup);
    void donateBlood(int iddonor);
    int countAllBy();







}
