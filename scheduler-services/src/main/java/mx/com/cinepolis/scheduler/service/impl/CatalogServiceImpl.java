package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.CatalogTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.service.CatalogService;

import java.util.ArrayList;
import java.util.List;

public class CatalogServiceImpl implements CatalogService{

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTO getUser() {
        UserTO userTO = new UserTO();
        userTO.setIdUser(1L);
        userTO.setName("Javier");
        userTO.setEmail("francisco.rodriguez@axity.com.mx");
        userTO.setUserName("jrodriguez");
        return userTO;
    }

    @Override
    public List<CatalogTO> getEstados(String pais) {
        List<CatalogTO> estados = new ArrayList<CatalogTO>();
        if (pais.equals("Mexico")) {
            estados.add(new CatalogTO() {
                {
                setName("Puebla");
                setId(1);
                }});
            estados.add(new CatalogTO(){
                {
                    setName("Tlaxcala");
                    setId(2);
                }});
            estados.add(new CatalogTO(){
                {
                    setName("Monterrey");
                    setId(3);
                }});
        }
        else
        {   estados.add(new CatalogTO() {
                {
                    setName("Texas");
                    setId(1);
                }});
            estados.add(new CatalogTO(){
                {
                    setName("California");
                    setId(1);
                }});
            estados.add(new CatalogTO(){
                {
                    setName("Canada");
                    setId(3);
                }});
        }

        return estados;
    }
}
