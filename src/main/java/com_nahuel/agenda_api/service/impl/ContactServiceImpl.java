package com_nahuel.agenda_api.service.impl;

import com_nahuel.agenda_api.dto.request.ContactDtoRequest;
import com_nahuel.agenda_api.dto.response.ContactDtoResponse;
import com_nahuel.agenda_api.entity.Contact;
import com_nahuel.agenda_api.mapper.ContactDtoMapper;
import com_nahuel.agenda_api.repository.ContactRepository;
import com_nahuel.agenda_api.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    public ContactServiceImpl(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public ContactDtoResponse create(ContactDtoRequest request) {
        Contact contact = ContactDtoMapper.toEntity(request);
        Contact saved = repository.save(contact);

        return ContactDtoMapper.toResponse(saved);
    }

    @Override
    public ContactDtoResponse update(UUID id, ContactDtoRequest request) {
        Contact existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found by id: " + id));

        existing.setFirstName(request.getFirstName());
        existing.setLastName(request.getLastName());
        existing.setPhone(request.getPhone());
        existing.setEmail(request.getEmail());
        existing.setFavorite(request.isFavorite());
        existing.setObservation(request.getObservation());

        Contact contactUpdate = repository.save(existing);
        return ContactDtoMapper.toResponse(contactUpdate);
    }

    @Override
    public List<ContactDtoResponse> findAll() {
        return repository.findAll().stream()
                .map(ContactDtoMapper::toResponse)
                .toList();
    }

    @Override
    public Optional<ContactDtoResponse> findById(UUID id) {
        return repository.findById(id)
                .map(ContactDtoMapper::toResponse);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
