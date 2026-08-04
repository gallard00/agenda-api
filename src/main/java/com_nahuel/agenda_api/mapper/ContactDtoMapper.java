package com_nahuel.agenda_api.mapper;

import com_nahuel.agenda_api.dto.request.ContactDtoRequest;
import com_nahuel.agenda_api.dto.response.ContactDtoResponse;
import com_nahuel.agenda_api.entity.Contact;

public class ContactDtoMapper {

    private ContactDtoMapper() {
        throw new IllegalStateException("I don't now");
    }

    public static Contact toEntity(ContactDtoRequest request) {
        if (request == null) {
            return null;
        }

        return Contact.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .observation(request.getObservation())
                .favorite(request.isFavorite())
                .build();
    }

    public static ContactDtoResponse toResponse(Contact contact) {
        if (contact == null) {
            return null;
        }

        ContactDtoResponse response = new ContactDtoResponse();

        response.setId(contact.getId());
        response.setFirstName(contact.getFirstName());
        response.setLastName(contact.getLastName());
        response.setEmail(contact.getEmail());
        response.setPhone(contact.getPhone());
        response.setObservation(contact.getObservation());
        response.setFavorite(response.isFavorite());

        return response;
    }
}
