package com.devstack.joblisting.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "user")
public class User {
    private String fullName;
    private String email;
    private String password;
    private String companyName;
}
