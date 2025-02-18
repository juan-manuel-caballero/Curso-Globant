package servicios;
import java.util.List;

import entidades.Cliente;
import persistencia.ClienteDAO;
public class ClienteServicio {
    private ClienteDAO cd;
    public  ClienteServicio(){
        this.cd =  new ClienteDAO();
    }
    public Cliente crearNuevoCliente(int codigoC, String nombre, String nombreContacto, String apellidoContacto,
            String telefono, String fax, String ciudad, String region, String pais, String codigoPostal,
            int idEmpleado, double limiteCredito) throws Exception {
        // Validaciones - Pueden estar metodo independiente.
       validacionesNyA(nombreContacto, apellidoContacto);
        Cliente cliente = new Cliente(codigoC, nombre, nombreContacto, apellidoContacto, telefono, fax, ciudad, region,
                pais, codigoPostal, idEmpleado, limiteCredito);
        cd.guardarCliente(cliente);
        return cliente;
    }
    public void validacionesNyA(String nombreContacto, String apellidoContacto) throws Exception{
        if (nombreContacto == null) {
            throw new Exception("El nombre del contacto no puede ser nulo.");
        }
        if (apellidoContacto == null) {
            throw new Exception("El apellido del contacto no puede ser nulo.");
        }
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        return cd.listarTodosLosClientes();
    }

    public List<Cliente> buscarPorCodigo(int codigo) throws Exception{
        validarBusqueda(codigo);
        return cd.buscarClientePorCodigo(codigo);
    }

    public void validarBusqueda(int codigo) throws Exception{
        if (codigo <= 0) {
            throw new Exception("El código del cliente no puede ser 0 o negativo.");
        }
    }
}