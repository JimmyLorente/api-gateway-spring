package com.example.Eventos.ParticipantesDTO;

import java.sql.Date;

import lombok.Data;

@Data
public class ParticipanteDTO {

    private Long id;
    private String nombre;
    private  int numeroParticipantes;
    private  boolean activo;
    private Date fechaInicio;
}
