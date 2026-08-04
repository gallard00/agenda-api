package com_nahuel.agenda_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDtoRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String observation;
    private boolean favorite;

}
