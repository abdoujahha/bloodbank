package com.abdallah.bloodbank.repos;

import com.abdallah.bloodbank.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MessageRepository extends JpaRepository<Message, Integer> {
@Query("select m from Message m where m.patient.id=?1")
List<Message> getMessagesByPatientId(int id);
}


