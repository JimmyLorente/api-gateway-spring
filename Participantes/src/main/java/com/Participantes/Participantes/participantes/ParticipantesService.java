package com.Participantes.Participantes.participantes;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class ParticipantesService {

    private final ParticipantesRepository participantesRepository;

    // Método para obtener todos los participantes
    public List<Participantes> getParticipantes() {
        return participantesRepository.findAll();   
    }

    // Método para obtener un participante por ID
    public Participantes getParticipantesById(Long id) {
        return participantesRepository.findById(id).orElse(null);

    }

    // Método para guardar un participante
    public Participantes save(Participantes participantes) {
        return participantesRepository.save(participantes);
    }

    // Método para eliminar un participante por ID
    public void delete(Long id) {
        participantesRepository.deleteById(id);
    }

    }


