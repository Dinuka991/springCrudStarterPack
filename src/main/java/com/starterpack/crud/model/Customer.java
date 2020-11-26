package com.starterpack.crud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table( name = "CustomerM")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customerId;
    String  firstName;
    String  lastName;
    String  mobileNumber;
    String email;
    String gender;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date dob;

}
