package com.Entradas.Entradas.Entradas;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entradas.Entradas.ParticipantesDTO.ParticipanteDTO;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/entradas")
@AllArgsConstructor
public class EntradasController {
    

    //Instanciar el servicio de eventos
    private final EntradasService entradasService;

    //Metodo Get para obtener todos los eventos
    @GetMapping()
    public List<Entradas> findAll() {
        return entradasService.getAllEntradas();
    }

    //Metodo Get paara id
    @GetMapping("/{id}")
    public Entradas findByid(@PathVariable("id") Long id) {
        return entradasService.getEntradasById(id);
    }

    //Metodo post
    @PostMapping()
    public Entradas save(@RequestBody Entradas eventos) {
        return (Entradas) entradasService.save(eventos);
    }

    //Metodo delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        entradasService.deleteEntradas(id);
    }

    @GetMapping("/participante/{id}")
    public ParticipanteDTO obtenerParticipanteDTO(@PathVariable("id") Long id) {
        return entradasService.obtenerParticipanteDTO(id);
    }
    
    
}
