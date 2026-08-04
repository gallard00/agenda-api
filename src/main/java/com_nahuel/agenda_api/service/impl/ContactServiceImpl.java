package com_nahuel.agenda_api.service.impl;

import com_nahuel.agenda_api.dto.request.ContactDtoRequest;
import com_nahuel.agenda_api.dto.response.ContactDtoResponse;
import com_nahuel.agenda_api.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService {
    @Override
    public ContactDtoResponse create(ContactDtoRequest request) {
        return null;
    }

    @Override
    public ContactDtoResponse update(UUID id, ContactDtoRequest request) {
        return null;
    }

    @Override
    public List<ContactDtoResponse> findAll() {
        return null;
    }

    @Override
    public ContactDtoResponse findById(UUID id) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
