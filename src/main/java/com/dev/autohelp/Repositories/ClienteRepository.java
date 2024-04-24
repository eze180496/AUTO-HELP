package com.dev.autohelp.Repositories;

import com.dev.autohelp.Entities.Cliente;
import com.dev.autohelp.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
