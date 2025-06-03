package com.neokart.entity.site;

import jakarta.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class AddressEmbeddable {
    private String email;
    private String phone;
    private String city;
    private String landMark;
    private String pincode;

    @Lob
    @Column(columnDefinition = "LONGLOB")
    private byte[] image;

    @Transient
    private MultipartFile file;
}
