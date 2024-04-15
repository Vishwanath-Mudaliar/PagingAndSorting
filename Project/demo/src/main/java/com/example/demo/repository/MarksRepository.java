package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Stud;

public interface MarksRepository extends PagingAndSortingRepository<Stud, Long> {

    //List<Stud> findAllByPrice(double marks, Pageable pageable);
}
