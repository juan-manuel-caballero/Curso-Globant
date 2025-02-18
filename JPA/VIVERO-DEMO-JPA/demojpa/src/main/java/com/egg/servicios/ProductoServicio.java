package com.egg.servicios;

import java.util.List;

import com.egg.entidades.Producto;
import com.egg.persistencia.ProductoDAO;

public class ProductoServicio {
    private final ProductoDAO daoProducto;// Instancio a la unidad d persistencia para acceder a los metodos del EM

    public ProductoServicio() {
        this.daoProducto = new ProductoDAO();
    }

    public void listarProductos() throws Exception {
        List<Producto> todasProductos = daoProducto.listarTodas();
        imprimirLista(todasProductos);
    }

       public void listarProductosPorId(int idGama) throws Exception {
        List<Producto> todasProductos = daoProducto.listarTodasPorId(idGama);
        imprimirLista(todasProductos);
    }

    private void imprimirLista(List<Producto> listaRecibida) throws Exception {
        for (Producto unitariaProducto : listaRecibida) {
            System.out.println(unitariaProducto.getCodigoProducto() + " - " + unitariaProducto.getNombre() + " - "
                    + unitariaProducto.getDescripcion() + unitariaProducto.getGamaProducto().getDescripcionHtml());
        }
    }
}