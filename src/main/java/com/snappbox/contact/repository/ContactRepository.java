package com.snappbox.contact.repository;

import com.snappbox.contact.domain.Contact;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@Tag(name = "contact", description = "the Contact API")
@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
