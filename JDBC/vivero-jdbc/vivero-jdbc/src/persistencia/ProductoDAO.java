package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidades.Producto;

public class ProductoDAO extends DAO{
    
    public void guardarProducto(Producto producto) throws Exception {
        if (producto == null) {
            throw new Exception("El producto no puede ser nulo");
        }

        try {
            String sql = "INSERT INTO producto (codigo_producto, nombre, id_gama, dimensiones, proveedor, descripcion, cantidad_en_stock, precio_venta, precio_proveedor) VALUES ('"
                    + producto.getCodigoProducto() + "', '"
                    + producto.getNombre() + "', '"
                    + producto.getIdGama() + "', '"
                    + producto.getDimensiones() + "', '"
                    + producto.getProveedor() + "', '"
                    + producto.getDescripcion() + "', '"
                    + producto.getCantidadEnStock() + "', '"
                    + producto.getPrecioVenta() + "', '"
                    + producto.getPrecioProveedor() + "' )";

            insertarModificarEliminarDataBase(sql);
        } catch (Exception e) {
            System.out.println("Se produjo un error" + e.getMessage());
        }
    }

    public List<Producto> listarTodosLosProductos() throws Exception {
        String sql = "SELECT id_producto, nombre, descripcion, proveedor FROM producto";

        consultarDataBase(sql);
        List<Producto> productos = new ArrayList<>();

        while (resultSet.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(resultSet.getInt("id_producto"));
            producto.setNombre(resultSet.getString("nombre"));
            producto.setDescripcion(resultSet.getString("descripcion"));
            producto.setProveedor(resultSet.getString("proveedor"));
            productos.add(producto);
        }
        return productos;
    }

    public void eliminarProductoPorId(int id) throws Exception {
        String sql = "DELETE FROM producto WHERE id_producto = " + id;
        insertarModificarEliminarDataBase(sql);
    }

    public List<Producto> buscarProductoPorId(int id) throws Exception {

        String sql = "SELECT id_producto, nombre, descripcion, proveedor FROM producto WHERE id_producto = " + id;

        consultarDataBase(sql);
        List<Producto> productos = new ArrayList<>();

        while (resultSet.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(resultSet.getInt("id_producto"));
            producto.setNombre(resultSet.getString("nombre"));
            producto.setDescripcion(resultSet.getString("descripcion"));
            producto.setProveedor(resultSet.getString("proveedor"));
            productos.add(producto);
        }
        return productos;
    }
}