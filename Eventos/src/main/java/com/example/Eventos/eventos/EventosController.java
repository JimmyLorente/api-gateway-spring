package com.example.Eventos.eventos;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Eventos.ParticipantesDTO.ParticipanteDTO;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/eventos")
@AllArgsConstructor
public class EventosController {
    

    //Instanciar el servicio de eventos
    private final EventosService eventosService;

    //Metodo Get para obtener todos los eventos
    @GetMapping()
    public List<Eventos> findAll() {
        return eventosService.getEventos();
    }

    //Metodo Get paara id
    @GetMapping("/{id}")
    public Eventos findByid(@PathVariable("id") Long id) {
        return eventosService.getEventosById(id);
    }

    //Metodo post
    @PostMapping()
    public Eventos save(@RequestBody Eventos eventos) {
        return (Eventos) eventosService.save(eventos);
    }

    //Metodo delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        eventosService.deleteEventos(id);
    }

    //Comunicar con el microservicio de participantes
    @GetMapping("/participante/{id}")
    public ParticipanteDTO obtenerParticipanteDTO(@PathVariable("id") Long id) {
        return eventosService.obtenerParticipanteDTO(id);
    }
    
}
