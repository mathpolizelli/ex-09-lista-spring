package com.mep.projetos.services;

import com.mep.projetos.models.ProjetoModel;
import com.mep.projetos.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<ProjetoModel> findAll() {
        return projetoRepository.findAll();
    }

    public ProjetoModel findById(Long id) {
        return projetoRepository.findById(id).get();
    }

    public ProjetoModel save(ProjetoModel pedidoModel) {
        return projetoRepository.save(pedidoModel);
    }

    public void delete(Long id) {
        projetoRepository.deleteById(id);
    }

}
