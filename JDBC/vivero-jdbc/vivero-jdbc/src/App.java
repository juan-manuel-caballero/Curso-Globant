//import entidades.Cliente;
import entidades.Producto;
import persistencia.ClienteDAO;
import persistencia.ProductoDAO;

public class App {

    public static void main(String[] args) throws Exception {

        ClienteDAO clienteDao = new ClienteDAO();
        ProductoDAO productoDao = new ProductoDAO();
        //Cliente cliente1 = new Cliente(3, "KFC", "Sandra", "Rodríguez", "3726872", "234", "Bogotá", "Cundinamarca", "Colombia", "23", 1, 300);
        //clienteDao.guardarCliente(cliente1);

        //Cliente cliente2 = new Cliente(4, "KFC", "Pedro", "Salamanca", "3452321", "123", "Bogotá", "Cundinamarca", "Colombia", "12", 2, 200);
        //clienteDao.guardarCliente(cliente2);

        System.out.println(clienteDao.listarTodosLosClientes());

        //System.out.println(clienteDao.buscarClientePorId(2));

        //System.out.println(productoDao.buscarProductoPorId(5));

        //Producto producto1 = new Producto();
        //productoDao.guardarProducto(producto1);
        //productoDao.eliminarProductoPorId(51);
        //System.out.println(productoDao.listarTodosLosProductos());
        //System.out.println(clienteDao.buscarClientePorId(2));

    }
}