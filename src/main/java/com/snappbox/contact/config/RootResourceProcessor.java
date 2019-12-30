package com.snappbox.contact.config;

import com.snappbox.contact.Controller.ContactController;
import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;

public class RootResourceProcessor implements RepresentationModelProcessor<RepositoryLinksResource> {
    @Override
    public RepositoryLinksResource process(RepositoryLinksResource model) {
        model.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(ContactController.class).find(null)).withRel("contact"));
        return model;
    }
}
