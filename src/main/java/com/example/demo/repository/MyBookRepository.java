package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MyBookList;

public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
