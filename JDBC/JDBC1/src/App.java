
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) throws Exception {
        Connection conexion = getConnection();
        //buscarClientePorEmpleado(conexion, 5);
        //getProductosParaReponer(conexion, 20);
        //getPedidosPorCliente(conexion, 3);
        getPedidosPorEstado(conexion, "Pendiente");
        cerrarConexion(conexion);
    }

    public static Connection getConnection() {
        String host = "127.0.0.1"; // localhost
        String port = "3306"; // por defecto es el puerto que utiliza
        String name = "root"; // usuario de la base de datos
        String password = "root"; // password de la base de datos
        String database = "vivero"; // nombre de la base de datos recien creada, en este caso vivero.
        // Esto especifica una zona horaria, no es obligatorio de utilizar, pero en
        // algunas zonas genera conflictos de conexión si no existiera
        String zona = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + zona;
        // esto indica la ruta de conexion, que es la combinacion de
        // host,usuario,puerto, nombre de la base de datos a la cual queremos
        // conectarnos y la zona horaria (si se precisara).

        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, name, password);
            //Inicio consulta

            //Fin consulta
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el conector JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("La conexión a la base de datos fue cerrada de manera exitosa");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión:" + e.getMessage());
            }
        }
    }

    public static void buscarClientes(Connection conexion) {
        String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente ";
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            while (rs.next()) {
                String nombre = rs.getString("nombre_contacto");
                String apellido = rs.getString("apellido_contacto");
                String telefono = rs.getString("telefono");
                count++;
                System.out.println(count + " - " + nombre + " " + apellido + " -  " + telefono);
            }
            // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void buscarClientePorCodigo(Connection conexion, int codigo) {

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente WHERE codigo_cliente = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                String nombre = rs.getString("nombre_contacto");
                String apellido = rs.getString("apellido_contacto");
                String telefono = rs.getString("telefono");
                count++;
                System.out.println(count + " - " + nombre + " " + apellido + " - " + telefono);
            }
// Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void buscarClientePorEmpleado(Connection conexion, int codigo) {

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente WHERE id_empleado = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                String nombre = rs.getString("nombre_contacto");
                String apellido = rs.getString("apellido_contacto");
                String telefono = rs.getString("telefono");
                count++;
                System.out.println(count + " - " + nombre + " " + apellido + " - " + telefono);
            }
            // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getProductosParaReponer(Connection conexion, int reposicion) {

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    "SELECT nombre, cantidad_en_stock FROM producto WHERE cantidad_en_stock < ?");
            ps.setInt(1, reposicion);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                Integer cantidad = rs.getInt("cantidad_en_stock");
                count++;
                System.out.println(count + " - " + nombre + " " + cantidad);
            }
            // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getPedidosPorCliente(Connection conexion, int cliente) {

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    "SELECT codigo_pedido, estado, fecha_pedido FROM pedido WHERE id_cliente = ?");
            ps.setInt(1, cliente);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                Integer nombre = rs.getInt("codigo_pedido");
                String estado = rs.getString("estado");
                String fecha_pedido = rs.getString("fecha_pedido");
                count++;
                System.out.println(count + " - " + nombre + " " + estado + " " + fecha_pedido);
            }
            // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    public static void getPedidosPorEstado(Connection conexion, String estado) {

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    "SELECT codigo_pedido, fecha_pedido FROM pedido WHERE estado = ?");
            ps.setString(1, estado);
            ResultSet rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                Integer nombre = rs.getInt("codigo_pedido");
                String fecha_pedido = rs.getString("fecha_pedido");
                count++;
                System.out.println(count + " - " + nombre + " " + " " + fecha_pedido);
            }
            // Cerrar ResultSet y Statement dentro del bloque try-catch-finally
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }
}
