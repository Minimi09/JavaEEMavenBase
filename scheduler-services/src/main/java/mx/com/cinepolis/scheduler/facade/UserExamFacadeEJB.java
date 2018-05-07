package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.UserExamTO;
import mx.com.cinepolis.scheduler.service.UserExamService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
@LocalBean
public class UserExamFacadeEJB {

    @Inject
    UserExamService userExamService;

    public UserExamTO getUser (String user, String password)
    {
        return userExamService.getUser(user, password);
    }

    public UserExamTO addUser (UserExamTO userExamTO)
    {
        return userExamService.addUser(userExamTO);
    }

    public void dropUser (String user)
    {

        userExamService.dropUser(user);
    }

    public UserExamTO alterUser (UserExamTO userExamTO)
    {
        return userExamService.alterUser(userExamTO);
    }

    public List<UserExamTO> findAllUsers ()
    {
       return userExamService.findAllUsers();
    }
}
