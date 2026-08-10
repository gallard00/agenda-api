package com_nahuel.agenda_api.controller;

import com_nahuel.agenda_api.dto.request.ContactDtoRequest;
import com_nahuel.agenda_api.dto.response.ContactDtoResponse;
import com_nahuel.agenda_api.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public ContactDtoResponse create(
            @RequestBody ContactDtoRequest request
    ) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public ContactDtoResponse update(
            @PathVariable UUID id,
            @RequestBody ContactDtoRequest request
    ) {
        return service.update(id, request);
    }

    @GetMapping
    public List<ContactDtoResponse> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ContactDtoResponse findById(
            @PathVariable UUID id
    ) {
        return service.findById(id);
    }
}
