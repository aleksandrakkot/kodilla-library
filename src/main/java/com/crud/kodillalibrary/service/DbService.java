package com.crud.kodillalibrary.service;

import com.crud.kodillalibrary.controller.BookNotFoundException;
import com.crud.kodillalibrary.controller.BorrowingNotFoundException;
import com.crud.kodillalibrary.controller.PublicationNotFoundException;
import com.crud.kodillalibrary.controller.ReaderNotFoundException;
import com.crud.kodillalibrary.domain.Book;
import com.crud.kodillalibrary.domain.Borrowing;
import com.crud.kodillalibrary.domain.Publication;
import com.crud.kodillalibrary.domain.Reader;
import com.crud.kodillalibrary.repository.BookRepository;
import com.crud.kodillalibrary.repository.BorrowingRepository;
import com.crud.kodillalibrary.repository.PublicationRepository;
import com.crud.kodillalibrary.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DbService {

    private final BookRepository bookRepository;
    private final BorrowingRepository borrowingRepository;
    private final PublicationRepository publicationRepository;
    private final ReaderRepository readerRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByPublicationId(Publication publication) {
        Long publicationId = publication.getId();
        List<Book> books = bookRepository.findAll().stream()
                .filter(n ->n.getPublication().getId().equals(publicationId))
                .toList();
        return books;
    }

    public Book getBook(final Long bookId) throws BookNotFoundException {
        return bookRepository.findById(bookId).orElseThrow(BookNotFoundException::new);
    }

    public Book saveBook(final Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(final Long bookId) {
        bookRepository.deleteById(bookId);
    }

    public List<Borrowing> getAllBorrowings() {
        return borrowingRepository.findAll();
    }

    public Borrowing getBorrowing(final Long borrowingId) throws BorrowingNotFoundException {
        return borrowingRepository.findById(borrowingId).orElseThrow(BorrowingNotFoundException::new);
    }

    public Borrowing saveBorrowing(final Borrowing borrowing) {
        borrowing.getBook().setStatus("borrowed");
        return borrowingRepository.save(borrowing);
    }

    public Borrowing saveUpdatedBorrowing(final Borrowing borrowing) {
        borrowing.getBook().setStatus("available");
        return borrowingRepository.save(borrowing);
    }

    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Publication getPublication(final Long publicationId) throws PublicationNotFoundException {
        return publicationRepository.findById(publicationId).orElseThrow(PublicationNotFoundException::new);
    }

    public Publication savePublication(final Publication publication) {
        return publicationRepository.save(publication);
    }

    public void deletePublication(final Long publicationId) {
        publicationRepository.deleteById(publicationId);
    }

    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public Reader getReader(final Long readerId) throws ReaderNotFoundException {
        return readerRepository.findById(readerId).orElseThrow(ReaderNotFoundException::new);
    }

    public Reader saveReader(final Reader reader) {
        return readerRepository.save(reader);
    }

    public void deleteReader(final Long readerId) {
        readerRepository.deleteById(readerId);
    }
}