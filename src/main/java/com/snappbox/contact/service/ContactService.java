package com.snappbox.contact.service;

import com.snappbox.contact.domain.Contact;
import com.snappbox.contact.repository.ContactRepository;
import com.snappbox.contact.service.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ContactService {

//    @Autowired
//    ContactRepository contactRepository;
//    @Autowired
//    ModelMapper mapper;
//
//    public ContactDto create(ContactDto contactDto) {
//        Contact contact = mapper.map(contactDto, Contact.class);
//        contact = contactRepository.save(contact);
//        return mapper.map(contact, ContactDto.class);
//    }
//
//    public List<Contact> search(Map<String, String> searchParams){
//        for (Map.Entry<String, String> entry : searchParams.entrySet()){
//
//        }
//    }

}
