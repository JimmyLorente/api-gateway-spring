package com.Entradas.Entradas.Entradas;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class EntradasService {
    // Assuming you have a repository to interact with the database
    private final EntradasRepository entradasRepository;

    // Metodo selecionar todos
    public List<Entradas> getAllEntradas() {
        return entradasRepository.findAll();
    }

    public Entradas findById(Long id) {
        return entradasRepository.findById(id).orElse(null);
    }

    public Entradas save(Entradas entradas) {
        return entradasRepository.save(entradas);
    }

    public void deleteEntradas(Long id) {
        entradasRepository.deleteById(id);
    }


    public Entradas getEntradasById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEntradasById'");
    }


}
