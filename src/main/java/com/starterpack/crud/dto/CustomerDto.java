package com.starterpack.crud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)

public class CustomerDto {

    private String firstName;
    private String lastName;
    private  String gender;
    private String mobile;
    private String email;
    private Date dob;

}
