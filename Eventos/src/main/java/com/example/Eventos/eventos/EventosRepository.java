package com.example.Eventos.eventos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventosRepository extends JpaRepository<Eventos, Long> {
    // Aquí puedes definir métodos personalizados si es necesario
    // Por ejemplo, para buscar eventos por nombre, fecha, etc.

}
