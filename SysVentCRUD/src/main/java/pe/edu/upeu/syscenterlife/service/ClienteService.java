<<<<<<<< HEAD:SysVentCRUDX/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
========

>>>>>>>> a0515a44086599a5861ef6607e88ca7269a2fc61:SysVentCRUD/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.dao.ClienteDao;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Service
public class ClienteService {
<<<<<<<< HEAD:SysVentCRUDX/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
    
    ClienteDao clienteDao=new ClienteDao();
    
========
    ClienteDao clienteDao;

>>>>>>>> a0515a44086599a5861ef6607e88ca7269a2fc61:SysVentCRUD/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente cliente) { //Create
        return clienteDao.guardarCliente(cliente)==1?true:false;
    }

<<<<<<<< HEAD:SysVentCRUDX/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
    public List<Cliente> listarEntidad() { //Report
========
    public List<Cliente> listarEntidad() {
        System.out.println("dd:");
        clienteDao=new ClienteDao();
>>>>>>>> a0515a44086599a5861ef6607e88ca7269a2fc61:SysVentCRUD/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
        return clienteDao.listarCliente();
    }

    public Cliente buscarCliente(String dnirucx) {
        return listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dnirucx))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Cliente updateEntidad(Cliente clientex) { //Update
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDniruc().equals(clientex.getDniruc())) // Filtrar por DNI
                .findFirst() // Obtener el primer cliente que cumpla con el filtro
                .ifPresent(cliente
<<<<<<<< HEAD:SysVentCRUDX/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
                        -> cliente.setNombre(clientex.getNombre()));
//return this.listaCli.set(index, cliente);
========
                        -> cliente.setNombres(clientex.getNombres()));
        //return this.listaCli.set(index, cliente);
>>>>>>>> a0515a44086599a5861ef6607e88ca7269a2fc61:SysVentCRUD/src/main/java/pe/edu/upeu/syscenterlife/service/ClienteService.java
        return buscarCliente(clientex.getDniruc());
    }

    public void deleteRegistEntdad(String dato) { //Delete
        listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dato))
                .findFirst().orElse(null));
    }
}
