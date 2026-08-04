package com_nahuel.agenda_api.controller;

import com_nahuel.agenda_api.dto.request.ContactDtoRequest;
import com_nahuel.agenda_api.dto.response.ContactDtoResponse;
import com_nahuel.agenda_api.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
