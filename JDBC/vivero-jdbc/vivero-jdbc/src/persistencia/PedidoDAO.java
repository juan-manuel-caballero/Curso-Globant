package persistencia;

import entidades.Pedido;

public class PedidoDAO extends DAO{
    public void guardarPedido(Pedido pedido) throws Exception {
        if (pedido == null) {
            throw new Exception("El producto no puede ser nulo");
        }

        try {
            String sql = "INSERT INTO producto (codigo_pedido, fecha_pedido, fecha_esperada, fecha_entrega, estado, comentarios, id_cliente) VALUES ('"
                    + pedido.getCodigoPedido() + "', '"
                    + pedido.getFechaPedido() + "', '"
                    + pedido.getFechaEsperada() + "', '"
                    + pedido.getFechaEntrega() + "', '"
                    + pedido.getEstado() + "', '"
                    + pedido.getComentarios() + "', '"
                    + pedido.getIdCliente() + "' )";

            insertarModificarEliminarDataBase(sql);
        } catch (Exception e) {
            System.out.println("Se produjo un error" + e.getMessage());
        }
    }
}