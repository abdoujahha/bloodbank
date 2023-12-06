package com.abdallah.bloodbank.service;

import com.abdallah.bloodbank.entities.BloodStock;
import com.abdallah.bloodbank.entities.Message;
import com.abdallah.bloodbank.entities.Request;
import com.abdallah.bloodbank.repos.BloodStockRepository;
import com.abdallah.bloodbank.repos.MessageRepository;
import com.abdallah.bloodbank.repos.PatientRepository;
import com.abdallah.bloodbank.repos.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    MessageRepository messageRepository;
    @Autowired
    BloodStockRepository bloodStockRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    RequestRepository requestRepository;

    @Override
    public Message saveMessageApproved(Message message) {
        BloodStock bloodStock = bloodStockRepository.getByBloodgroup(message.getPatient().getBloodGroup());
        int currentQuantity = bloodStock.getQuantity();
        if (currentQuantity >= 450) {
            bloodStock.setQuantity(currentQuantity - 450);
        } else {
            //TODO: send email to admin
        }
        Request R = requestRepository.findByPatient(message.getPatient());
        requestRepository.delete(R);
        return messageRepository.save(message);
    }


    @Override
    public Message saveMessageRejected(Message message) {
        Request R = requestRepository.findByPatient(message.getPatient());
        requestRepository.delete(R);
        return messageRepository.save(message);
    }



    @Override
    public void deleteMessageById(int idmessage) {
        messageRepository.deleteById(idmessage);
    }

    @Override
    public Message getMessageById(int idmessage) {
        return messageRepository.findById(idmessage).get();
    }

    @Override
    public Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> getMessagesByPatientId(Integer idpatient) {
        return messageRepository.getMessagesByPatientId(idpatient);
    }
}
