package com.crud.kodillalibrary.repository;
import com.crud.kodillalibrary.domain.Borrowing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BorrowingRepository extends CrudRepository<Borrowing, Long> {

    @Override
    List<Borrowing> findAll();

    @Override
    Borrowing save(Borrowing borrowing);

    @Override
    Optional<Borrowing> findById(Long id);
}