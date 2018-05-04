package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.CatalogTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;

import java.util.List;

/**
 * @author jrodriguez
 */
public interface CatalogService {

    /**
     *
     * @return User
     */
    UserTO getUser();

    /**
     * @param pais acepta el nombre de un pais (string)
     * @return Lista de estados de un pais
     */
    List<CatalogTO> getEstados( String pais);

    /**
     *
     * @return lista de todos los usuarios
     */

    List<UserTO> getAllUsers ();

}