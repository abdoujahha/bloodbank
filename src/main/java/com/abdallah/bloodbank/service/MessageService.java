package com.abdallah.bloodbank.service;

import com.abdallah.bloodbank.entities.Message;

import java.util.List;

public interface MessageService {
    Message saveMessageApproved(Message message);
    Message saveMessageRejected(Message message);
    void deleteMessageById(int idmessage);
    Message getMessageById(int idmessage);
    Iterable<Message> getAllMessages();
    List<Message> getMessagesByPatientId(Integer idpatient);
}
