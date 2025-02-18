package servicios;

import entidades.Comentario;
import persistencia.ComentarioDAO;

import java.sql.SQLException;
import java.text.ParseException;

public class ComentarioServicio {
  private final ComentarioDAO comentarioDAO;

  public ComentarioServicio() {
    this.comentarioDAO = new ComentarioDAO();
  }

  public void crearNuevacomentario(Comentario comentario) throws ParseException {
    validarDatos(comentario);
    comentarioDAO.crearComentario(comentario);
  }

  private void validarDatos(Comentario comentario) {
    if (comentario == null) throw new IllegalArgumentException("Comentario no puede ser nulo");
    if (comentario.getIdCasa() == 0) throw new IllegalArgumentException("Id de la casa debe ser un ID válido");
    if (comentario.getComentario() == null || comentario.getComentario().isEmpty()) throw new IllegalArgumentException("El comentario no puede ser nulo o vacío");
  }

    public String listarTodosLosComentarios(int idCasa) throws SQLException {
        return comentarioDAO.buscarComentario(idCasa);
    }
}