package com.korkmaz.document;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class UserProfile {
    @Id
    private String id;
    private Long authId;
    private String userName;
    private String name;
    private String surName;
    private String phone;
    private String email;
    private String avatar;
    private String insta;
    private String twitter;
    private String isActive;
    private Long createdAt;
}
