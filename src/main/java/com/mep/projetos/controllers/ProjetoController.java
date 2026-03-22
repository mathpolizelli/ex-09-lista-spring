package com.mep.projetos.controllers;

import com.mep.projetos.models.ProjetoModel;
import com.mep.projetos.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> findAll() {
        return ResponseEntity.ok().body(projetoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(projetoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ProjetoModel> save(@RequestBody ProjetoModel projetoModel) {
        return ResponseEntity.status(201).body(projetoService.save(projetoModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        projetoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
