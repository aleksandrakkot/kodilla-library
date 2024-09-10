package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PublicationDto {
    private Long id;
    private String title;
    private String author;
    private int publicationDate;
}
