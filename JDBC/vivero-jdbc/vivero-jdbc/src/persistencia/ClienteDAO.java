package persistencia;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends DAO {

    public void guardarCliente(Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("El cliente no puede ser nulo");
        }

        try {
            String sql = "INSERT INTO cliente (codigo_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax, ciudad, region, pais, codigo_postal, id_empleado, limite_credito) VALUES ('"
                    + cliente.getCodigoCliente() + "', '"
                    + cliente.getNombreCliente() + "', '"
                    + cliente.getNombreContacto() + "', '"
                    + cliente.getApellidoContacto() + "', '"
                    + cliente.getTelefono() + "', '"
                    + cliente.getFax() + "', '"
                    + cliente.getCiudad() + "', '"
                    + cliente.getRegion() + "', '"
                    + cliente.getPais() + "', '"
                    + cliente.getCodigoPostal() + "', '"
                    + cliente.getIdEmpleado() + "', '"
                    + cliente.getLimiteCredito() + "' )";

            insertarModificarEliminarDataBase(sql);
        } catch (Exception e) {
            System.out.println("Se produjo un error" + e.getMessage());
        }
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        String sql = "SELECT id_cliente, nombre_cliente, nombre_contacto, apellido_contacto FROM cliente";

        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();

        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            cliente.setNombreContacto(resultSet.getString("nombre_contacto"));
            clientes.add(cliente);
        }
        return clientes;
    }

    public void eliminarClientePorId(int id) throws Exception {
        String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
        insertarModificarEliminarDataBase(sql);
    }

    public List<Cliente> buscarClientePorId(int id) throws Exception {

        String sql = "SELECT id_cliente, nombre_cliente, nombre_contacto, apellido_contacto FROM cliente WHERE id_cliente = " + id;

        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();

        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            cliente.setNombreContacto(resultSet.getString("nombre_contacto"));
            clientes.add(cliente);
        }
        return clientes;
    }
    public List<Cliente> buscarClientePorCodigo(int codigo) throws Exception {

        String sql = "SELECT id_cliente, nombre_cliente, nombre_contacto, apellido_contacto FROM cliente WHERE id_cliente = " + codigo;

        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();

        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            cliente.setNombreContacto(resultSet.getString("nombre_contacto"));
            clientes.add(cliente);
        }
        return clientes;
    }
}
