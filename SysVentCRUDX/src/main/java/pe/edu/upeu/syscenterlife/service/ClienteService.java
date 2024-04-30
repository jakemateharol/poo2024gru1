package pe.edu.upeu.syscenterlife.service;

import pe.edu.upeu.syscenterlife.dao.ClienteDao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Service
public class ClienteService {
    ClienteDao clienteDao=new ClienteDao();

    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente categoria) { //CREATE
        return clienteDao.guardarCliente(Cliente)==1?true:false;
    }

    public List<Cliente> listarEntidad() {
        return clienteDao.listarCliente();
    }

    public Cliente buscarCliente(String dnirucx) {
        return listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dnirucx))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningúncliente
    }

    public Cliente updateEntidad(Cliente clientex) {
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDniruc().equals(clientex.getDniruc())) // Filtrar por DNI
                .findFirst() // Obtener el primer cliente que cumpla con elfiltro
                .ifPresent(cliente
                        -> cliente.setNombre(clientex.getNombre()));
        //return this.listaCli.set(index, cliente);
        return buscarCliente(clientex.getDniruc());
    }

    public void deleteRegistEntdad(String dato) {
        this.listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dato))
                .findFirst().orElse(null));
    }
}
