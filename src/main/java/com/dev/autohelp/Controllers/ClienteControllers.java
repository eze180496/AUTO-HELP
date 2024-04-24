package com.dev.autohelp.Controllers;

import com.dev.autohelp.Entities.Cliente;
import com.dev.autohelp.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping
public class ClienteControllers {
    @Autowired
    private ClienteService clienteService;
    @PostMapping("/salvarCliente")
    public void salvar(Cliente cliente){
        clienteService.salvar(cliente);
    }
    @GetMapping("buscar/{id}")
    public Cliente buscarPorId( @PathVariable  Long id){
        return   clienteService.buscarPorId(id);
    }


    @DeleteMapping("deletar/{id}")
    public void deletarPorId(  @PathVariable Long id){
       clienteService.deletarPorId(id);
    }

    @GetMapping("/buscarClientes")
    public List<Cliente> buscarClientes(){
       return clienteService.buscarClientes();
    }

    @PutMapping("atualizarCLiente/{id}")
    public void atualizarCliente( @PathVariable  Long id, @RequestBody Cliente cliente){
       clienteService.atualizarCliente(id,cliente);
    }
}
