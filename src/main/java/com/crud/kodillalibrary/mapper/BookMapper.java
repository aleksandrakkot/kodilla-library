package com.crud.kodillalibrary.mapper;

import com.crud.kodillalibrary.domain.Book;
import com.crud.kodillalibrary.domain.BookDto;
import com.crud.kodillalibrary.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookMapper {

    @Autowired
    private PublicationRepository repository;

    public Book mapToBook(final BookDto bookDto) {
        return new Book(
                bookDto.getId(),
                bookDto.getStatus(),
                repository.findById(bookDto.getPublicationId()).get()
        );
    }
    public BookDto mapToBookDto(final Book book) {
        return new BookDto(
                book.getId(),
                book.getPublication().getId(),
                book.getStatus()
        );
    }
    public List<BookDto> mapToBookDtoList(final List<Book> bookList) {
        return bookList.stream()
                .map(this::mapToBookDto)
                .toList();
    }
}