package org.binaryminds.kinvana.dominio.service;

import org.binaryminds.kinvana.persistence.crud.ClienteCrud;
import org.binaryminds.kinvana.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    // Inyección de dependencias de mi Repositorio (ClienteCrud) [ClienteRepository]
    @Autowired
    private ClienteCrud crud;

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = crud.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer codigo) {
        Cliente cliente = crud.findById(codigo).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        crud.save(cliente); //agregar nuevo y editar
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        crud.delete(cliente);
    }
}
