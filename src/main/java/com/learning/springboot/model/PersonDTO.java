package com.learning.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // this will tell spring don't include default value
public class PersonDTO {

    private String name;

    private String email;

    private String phoneNumber;

    private int age;

    public PersonDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
