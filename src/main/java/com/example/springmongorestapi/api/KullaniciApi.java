package com.example.springmongorestapi.api;

import com.example.springmongorestapi.entity.Kullanici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.springmongorestapi.repository.KullaniciRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KullaniciApi {

    @Autowired
    private final KullaniciRepository kullaniciRepository;

    public KullaniciApi(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<Kullanici> add(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Kullanici>> getList() {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
