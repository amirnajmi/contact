package com.snappbox.contact.Controller;

import com.snappbox.contact.domain.Contact;
import com.snappbox.contact.service.ContactService;
import com.snappbox.contact.service.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@RepositoryRestController
public class ContactController {

    @Autowired
    private ContactService contactService;
    @RequestMapping(value = "/contact/search", method = RequestMethod.GET)
    public ResponseEntity<List<Contact>> find(ContactDto contactDto){
        return contactService.filter(contactDto);
    }
}
