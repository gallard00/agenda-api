package com_nahuel.agenda_api.service;

import com_nahuel.agenda_api.dto.request.ContactDtoRequest;
import com_nahuel.agenda_api.dto.response.ContactDtoResponse;

import java.util.List;
import java.util.UUID;

public interface ContactService {
    ContactDtoResponse create(ContactDtoRequest request);
    ContactDtoResponse update(UUID id, ContactDtoRequest request);
    List<ContactDtoResponse> findAll();
    ContactDtoResponse findById(UUID id);
    void delete(UUID id);
}
