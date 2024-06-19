package dev.vorstu.repositories;



import dev.vorstu.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;

@Repository
public interface studentrepository extends PagingAndSortingRepository<Student, Long> {
    Page<Student> findAll(Example<Student> example, Pageable pageable );

}


