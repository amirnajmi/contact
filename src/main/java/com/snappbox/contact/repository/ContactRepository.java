package com.snappbox.contact.repository;

import com.snappbox.contact.domain.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")

public interface ContactRepository extends MongoRepository<Contact, String>, CrudRepository<Contact, String> {
}
