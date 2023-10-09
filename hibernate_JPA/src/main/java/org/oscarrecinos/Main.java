package org.oscarrecinos;

import jakarta.persistence.*;
import org.oscarrecinos.entity.Cliente;
import org.oscarrecinos.services.ClienteService;
import org.oscarrecinos.services.ClienteServiceImpl;
import org.oscarrecinos.util.JpaUtil;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        ClienteService service = new ClienteServiceImpl(em);

        System.out.println("========Listar=========");
        List<Cliente> clientes = service.listar();
        clientes.forEach(System.out::println);

        System.out.println("========Obtener por id============");
        Optional<Cliente> optionalCliente = service.porId(1L);
        optionalCliente.ifPresent(System.out::println);

        System.out.println("========Insertar nuevo cliente=========");
        Cliente cliente = new Cliente();
        cliente.setNombre("Oscar");
        cliente.setApellido("Recinos");
        cliente.setFormaPago("Paypal");
        service.guardar(cliente);
        System.out.println("Cliente guardado con exito");
        service.listar().forEach(System.out::println);

        System.out.println("=======Editar cliente==========");
        Long id = cliente.getId();
        optionalCliente = service.porId(id);
        optionalCliente.ifPresent(c -> {
            c.setFormaPago("Mercado pago");
            service.guardar(c);
            System.out.println("Cliente editado con exito!");
            service.listar().forEach(System.out::println);
        });

        System.out.println("========Eliminar Cliente========");
        id  = cliente.getId();
        optionalCliente = service.porId(id);
        optionalCliente.ifPresent(c -> {
            service.eliminar(c.getId());
            System.out.println("Cliente eliminado con exito");
            service.listar().forEach(System.out::println);
        });

        em.close();



    }
}