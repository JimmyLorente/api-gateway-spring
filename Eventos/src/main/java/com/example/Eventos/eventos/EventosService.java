package com.example.Eventos.eventos;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Eventos.ParticipantesDTO.ParticipanteDTO;
import com.example.Eventos.ParticipantesDTO.ParticipanteFeingApi;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EventosService {

    private final EventosRepository eventosRepository;
    private final ParticipanteFeingApi participanteFeingApi;

    // Método para obtener todos los eventos
    public List<Eventos> getEventos() {
        return eventosRepository.findAll();
    }

    // Método para obtener un evento por ID
    public Eventos getEventosById(Long id) {
        return eventosRepository.findById(id).orElse(null);
    }

    // Método para guardar un evento
    public Eventos save(Eventos eventos) {
        return eventosRepository.save(eventos);
    }

    // Método para eliminar un evento por ID
    public void deleteEventos(Long id) {
        eventosRepository.deleteById(id);
    }

    //Comunicar con el microservicio de participantes
    public ParticipanteDTO obtenerParticipanteDTO(Long id) {
        return participanteFeingApi.BuscarParticipantePorId(id);

    }

}
