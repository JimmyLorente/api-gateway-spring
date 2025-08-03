package com.Entradas.Entradas.ParticipantesDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Participantes")
public interface ParticipanteFeingApi {
    @GetMapping("/participantes/{id}")
    ParticipanteDTO BuscarParticipantePorId(@PathVariable("id") Long id);
    
}
