package com.abdallah.bloodbank.service;

import com.abdallah.bloodbank.entities.BloodStock;

import java.util.List;

public interface BloodStockService {
    BloodStock saveBloodStock(BloodStock bloodStock);
    BloodStock updateBloodStock(BloodStock bloodStock);
    void deleteBloodStock(BloodStock bloodStock);
    void deleteBloodStockById(int idbloodstock);
    BloodStock getBloodStockById(int idbloodstock);
    List<BloodStock> getAllBloodStocks();
    BloodStock findByBloodType(String bloodType);
    //sumBloodGroupQuantities
    int sumBloodGroupQuantities();



}
