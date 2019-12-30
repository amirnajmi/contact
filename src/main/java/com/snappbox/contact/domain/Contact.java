package com.snappbox.contact.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "contacts")
public class Contact {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
    private String email;
    private String organization;
    private String github;

}
