package servicios;

import java.util.Date;

import entidades.Pedido;
import persistencia.PedidoDAO;

public class PedidoServicio {
    private PedidoDAO pedidoDao;
    public  PedidoServicio(){
        this.pedidoDao =  new PedidoDAO();
    }
    public Pedido crearNuevoPedido(int codigoP, Date fecha_pedido, Date fecha_esperada, Date fecha_entrega,
            String estado, String comentarios, int id_cliente) throws Exception {
        // Validaciones - Pueden estar metodo independiente.
        validacionesFecha(fecha_pedido);
        Pedido pedido = new Pedido(codigoP, fecha_pedido, fecha_esperada, fecha_entrega, estado, comentarios,id_cliente);
        pedidoDao.guardarPedido(pedido);
        return pedido;
    }
    public void validacionesFecha(Date fecha_de_pedido) throws Exception{
        if (fecha_de_pedido == null) {
            throw new Exception("La fecha del pedido no puede ser nulo.");
        }
    }
}