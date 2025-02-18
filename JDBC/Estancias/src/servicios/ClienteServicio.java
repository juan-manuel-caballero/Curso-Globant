package servicios;

import entidades.Cliente;
import persistencia.ClienteDAO;

import java.sql.SQLException;
import java.util.List;

public class ClienteServicio {
  private final ClienteDAO clienteDAO;
  public ClienteServicio() {
    this.clienteDAO = new ClienteDAO();
  }

  public List<Cliente> listarTodosLosClientes() throws SQLException, ClassNotFoundException {
      return clienteDAO.listarClientes();
  }

  public void guardarCliente(Cliente cliente) {
    validacionDatos(cliente);
    clienteDAO.guardarCliente(cliente);
  }

  private void validacionDatos(Cliente cliente) {
    if (cliente == null) throw new IllegalArgumentException("Cliente no puede ser nulo");
    if (cliente.getNombre() == null || cliente.getNombre().isEmpty()) throw new IllegalArgumentException("Nombre no puede ser nulo o vacío");
    if (cliente.getCiudad() == null) throw new IllegalArgumentException("Ciudad no puede ser nulo");
    if (cliente.getPais() == null) throw new IllegalArgumentException("País no puede ser nulo");
  }

  public Cliente buscarClientePorCodigo(int codigo) {
    return clienteDAO.buscarClientePorCodigo(codigo);
  }
}