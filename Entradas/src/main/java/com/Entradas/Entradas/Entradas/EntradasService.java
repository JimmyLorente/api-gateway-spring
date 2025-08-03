package com.Entradas.Entradas.Entradas;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Entradas.Entradas.ParticipantesDTO.ParticipanteDTO;
import com.Entradas.Entradas.ParticipantesDTO.ParticipanteFeingApi;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class EntradasService {
    // Assuming you have a repository to interact with the database
    private final EntradasRepository entradasRepository;
    private final ParticipanteFeingApi participanteFeingApi;

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
        throw new UnsupportedOperationException("Unimplemented method 'getEntradasById'");
    }
    
    // Comunicar con el microservicio de participantes
    public ParticipanteDTO obtenerParticipanteDTO(Long id) {
        return participanteFeingApi.BuscarParticipantePorId(id);
    }


}
