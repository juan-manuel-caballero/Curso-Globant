package servicios;

import entidades.Casa;
import persistencia.CasaDAO;

import java.sql.SQLException;
import java.util.List;

public class CasaServicio {
  private final CasaDAO casaDAO;

  public CasaServicio() {
    this.casaDAO = new CasaDAO();
  }

  public List<Casa> listarTodasLasCasas() throws SQLException {
    return casaDAO.listarTodasLasCasas();
  }

  public Casa buscarCasaPorId(int id) throws SQLException {
    return casaDAO.buscarCasaPorId(id);
  }

  public void crearCasa(Casa casa) throws SQLException {
    if(casa == null) throw new IllegalArgumentException("Casa no puede ser nula o vacía");
    if((casa.getCalle().isEmpty()) || (casa.getCalle() == null)) throw new IllegalArgumentException("Casa no puede ser nula o vacía");
    casaDAO.crearCasa(casa);
  }

  public void eliminarCasa(int id) throws SQLException {
    casaDAO.eliminarCasa(id);
  }
}