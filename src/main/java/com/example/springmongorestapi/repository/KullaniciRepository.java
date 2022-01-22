package com.example.springmongorestapi.repository;

import com.example.springmongorestapi.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends MongoRepository<Kullanici,Long> {
}
