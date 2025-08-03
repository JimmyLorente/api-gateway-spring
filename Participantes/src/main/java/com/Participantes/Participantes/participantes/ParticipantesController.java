package com.Participantes.Participantes.participantes;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/participantes")
@AllArgsConstructor
public class ParticipantesController {
    

    //Instanciar el servicio de eventos
    private final ParticipantesService eventosService;

    //Metodo Get para obtener todos los eventos
    @GetMapping()
    public List<Participantes> findAll() {
        return eventosService.getParticipantes();
    }

    //Metodo Get paara id
    @GetMapping("/{id}")
    public Participantes findByid(@PathVariable("id") Long id) {
        return eventosService.getParticipantesById(id);
    }

    //Metodo post
    @PostMapping()
    public Participantes save(@RequestBody Participantes eventos) {
        return (Participantes) eventosService.save(eventos);
    }

    //Metodo delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        eventosService.delete(id);
    }

}