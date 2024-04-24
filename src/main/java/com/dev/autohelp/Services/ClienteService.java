package com.dev.autohelp.Services;

import com.dev.autohelp.Entities.Cliente;
import com.dev.autohelp.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public void salvar(Cliente cliente){
        clienteRepository.save(cliente);
    }
    public Cliente buscarPorId(Long id){
        Cliente c = clienteRepository.findById(id).get();
        if(c == null){
            throw new IllegalArgumentException("Cliente não existe no banco de dados");
        }
        return c;
    }


    public void deletarPorId(Long id){
        Cliente c = clienteRepository.findById(id).get();
        if(c == null){
            throw new IllegalArgumentException("Cliente não existe no banco de dados");
        }
        clienteRepository.deleteById(id);
    }

    public List<Cliente> buscarClientes(){
        return clienteRepository.findAll();
    }

    public void atualizarCliente(Long id, Cliente cliente){
        Cliente c = clienteRepository.findById(id).get();
        if(c == null){
            throw new IllegalArgumentException("Cliente não existe no banco de dados");
        }
        clienteRepository.save(cliente);
    }
}
