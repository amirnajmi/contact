package com.snappbox.contact.service;

import com.snappbox.contact.domain.Contact;
import com.snappbox.contact.repository.ContactRepository;
import com.snappbox.contact.service.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;
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

    @RequestMapping(method= RequestMethod.GET, path="/contacts/find", produces = "application/hal+json")
    public ResponseEntity<List<Contact>> filter(ContactDto contactDto){
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example example = Example.of(contactDto);
        final ExampleMatcher matcher1 = example.getMatcher();
        matcher1.withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        final List<Contact> all = this.contactRepository.findAll(example);

        return ResponseEntity.ok(all);
    }
}
