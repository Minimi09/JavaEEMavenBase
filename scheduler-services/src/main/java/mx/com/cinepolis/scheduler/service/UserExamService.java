package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.UserExamTO;

import java.util.List;

public interface UserExamService {

    UserExamTO getUser (String user, String password);

    UserExamTO addUser (UserExamTO userExamTO);

    void dropUser (String user);

    UserExamTO alterUser (UserExamTO userExamTO);

    List<UserExamTO> findAllUsers();

}
