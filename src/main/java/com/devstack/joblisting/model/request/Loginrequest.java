package com.devstack.joblisting.model.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Loginrequest {
    private String email;
    private String password;
}
