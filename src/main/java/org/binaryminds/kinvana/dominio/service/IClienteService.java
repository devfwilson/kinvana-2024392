package org.binaryminds.kinvana.dominio.service;

import org.binaryminds.kinvana.persistence.entity.Cliente;

import java.util.List;

public interface IClienteService {
    // firmas de método
    List<Cliente> listarClientes();
    Cliente buscarClientePorId(Integer codigo);
    void guardarCliente(Cliente cliente);
    void eliminarCliente(Cliente cliente);
}
