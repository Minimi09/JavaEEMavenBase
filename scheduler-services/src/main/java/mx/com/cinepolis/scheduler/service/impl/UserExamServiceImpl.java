package mx.com.cinepolis.scheduler.service.impl;

import mx.com.arquitectura.base.model.UserExamDO;
import mx.com.cinepolis.scheduler.commons.to.UserExamTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserExamDAO;
import mx.com.cinepolis.scheduler.service.UserExamService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class UserExamServiceImpl implements UserExamService {

    @Inject
    private UserExamDAO userExamDAO;

    @Override
    public UserExamTO getUser(String user, String password) {
        UserExamDO userExamDO = userExamDAO.getByColumn("user", UserExamDO.class, user);
        if (userExamDO.getPassword().equals(password))
        {
            UserExamTO userExamTO = new UserExamTO();
            userExamTO.setIdUser(userExamDO.getIdUser());
            userExamTO.setName(userExamDO.getName());
            userExamTO.setPassword(userExamDO.getPassword());
            userExamTO.setIdPermission(userExamDO.getIdPermission());
            userExamTO.setUser(userExamDO.getUser());
            return userExamTO;
        }
        return null;
    }

    @Override
    public UserExamTO addUser(UserExamTO userExamTO) {
        UserExamDO userExamDO = new UserExamDO();
        userExamDO.setIdUser(userExamTO.getIdUser());
        userExamDO.setName(userExamTO.getName());
        userExamDO.setPassword(userExamTO.getPassword());
        userExamDO.setIdPermission(userExamTO.getIdPermission());
        userExamDO.setUser(userExamTO.getUser());

        userExamDAO.create(userExamDO);

        return userExamTO;
    }

    @Override
    public void dropUser(String user) {
        UserExamDO userExamDO = userExamDAO.getByColumn("user", UserExamDO.class, user);

        userExamDAO.delete(userExamDO.getIdUser());

    }

    @Override
    public UserExamTO alterUser(UserExamTO userExamTO) {
        UserExamDO userExamDO1 = userExamDAO.getByColumn("user", UserExamDO.class, userExamTO.getUser());
        UserExamDO userExamDO = new UserExamDO();
        userExamDO.setIdUser(userExamDO1.getIdUser());
        userExamDO.setName(userExamTO.getName());
        userExamDO.setPassword(userExamTO.getPassword());
        userExamDO.setIdPermission(userExamTO.getIdPermission());
        userExamDO.setUser(userExamTO.getUser());

        userExamDAO.update(userExamDO);

        return userExamTO;
    }

    @Override
    public List<UserExamTO> findAllUsers() {
        List<UserExamDO> usersList  = userExamDAO.findAll();
        return usersList
                .stream()
                .map(x ->new UserExamTO(){{
                    setIdUser(x.getIdUser());
                    setName (x.getName());
                    setIdPermission(x.getIdPermission());
                    setPassword(x.getPassword());
                    setUser(x.getUser());
                }}).collect(Collectors.toList());
    }
}
