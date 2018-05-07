package mx.com.cinepolis.scheduler.service.impl;

import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.commons.to.CatalogTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserDAO;
import mx.com.cinepolis.scheduler.service.CatalogService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Realmente aqui van las llamadas a los queries
//Revisar mi fuente de informacion, si ya tengo los queries que me ayudan

public class CatalogServiceImpl implements CatalogService{

    @Inject
    private UserDAO userDAO;
    /**
     * {@inheritDoc}
     */
    @Override
    public UserTO getUser() {
        UserTO userTO = new UserTO();
        userTO.setIdUser(1L);
        userTO.setName("Javier");
        userTO.setAvatarUrl(" ");
        userTO.setFollowers(1);
        userTO.setFollowing(1);
        userTO.setLogin("gatito");
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
        else if (pais.equals("USA"))
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

    @Override
    public List<UserTO> getAllUsers() {

        List<UserDO> usersList = userDAO.findAll();
        return usersList
                .stream()
                .map(x ->new UserTO(){{
                setLogin(x.getLogin());
                setFollowing(x.getFollowing());
                setAvatarUrl(x.getAvatarUrl());
                setIdUser(x.getIdUser());
                setName(x.getName());
                setFollowers(x.getFollowers());
            }}).collect(Collectors.toList());
    }

    @Override
    public UserTO create(UserTO userTO) {
        UserDO userDO = new UserDO();
        userDO.setIdUser(userTO.getIdUser());
        userDO.setLogin(userTO.getLogin());
        userDO.setAvatarUrl(userTO.getAvatarUrl());
        userDO.setFollowers(userTO.getFollowers());
        userDO.setFollowing(userTO.getFollowing());
        userDO.setName(userTO.getName());
        userDAO.create(userDO);
        return userTO;
    }

    @Override
    public UserTO findByLogin(long id) {
        UserDO userDO = userDAO.getById(id);
        UserTO userTO = new UserTO();
        userTO.setName(userDO.getName());
        userTO.setFollowers(userDO.getFollowers());
        userTO.setIdUser(userDO.getIdUser());
        userTO.setAvatarUrl(userDO.getAvatarUrl());
        userTO.setFollowing(userDO.getFollowing());
        userTO.setLogin(userDO.getLogin());
        return userTO;
    }
}