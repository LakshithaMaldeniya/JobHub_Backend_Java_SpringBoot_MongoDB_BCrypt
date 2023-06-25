package com.devstack.joblisting.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "post")
public class Post   {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

}
