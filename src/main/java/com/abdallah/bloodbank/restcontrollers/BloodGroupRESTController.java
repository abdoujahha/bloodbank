package com.abdallah.bloodbank.restcontrollers;


import com.abdallah.bloodbank.entities.BloodGroup;
import com.abdallah.bloodbank.repos.BloodGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bloodGroup")
@CrossOrigin("*")
public class BloodGroupRESTController {

    @Autowired
    BloodGroupRepository bloodGroupRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<BloodGroup> getAllBloodGroups() {
        return bloodGroupRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public BloodGroup saveBloodGroup(@RequestBody BloodGroup bloodGroup) {
        return bloodGroupRepository.save(bloodGroup);
    }




}
