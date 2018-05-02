package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.CatalogTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.service.CatalogService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
@LocalBean
public class CatalogFacadeEJB {

    @Inject
    CatalogService catalogService;

    public UserTO getSimpleUser()
    {
        return catalogService.getUser();
    }

    public List<CatalogTO> getListEstados(String pais)
    {

        return catalogService.getEstados(pais);
    }

}
