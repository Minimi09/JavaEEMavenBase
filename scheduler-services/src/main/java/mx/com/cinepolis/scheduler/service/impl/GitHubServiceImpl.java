package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.FormularioTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.ValidateUserTO;
import mx.com.cinepolis.scheduler.service.GitHubService;

import java.text.Normalizer;

public class GitHubServiceImpl implements GitHubService {

    @Override
    public GitHubUserTO getUser(String login) {

        GitHubUserTO gitHubUserTO = new GitHubUserTO();
        if(login.equals("Minimi09"))
        {gitHubUserTO.setLogin("Minimi09");
        gitHubUserTO.setFollowers(1);
        gitHubUserTO.setFollowing(1);
        gitHubUserTO.setName("Minely Pereyra");
        gitHubUserTO.setAvatar_url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5BcHfjtVZjCdiZd9w1fVSFMTBYXOgzzfkCc0q9YA5OkN01XGz");}
        return gitHubUserTO;
    }

    @Override
    public ValidateUserTO getUserQueryString(String user, String pswd) {
        ValidateUserTO validateUserTO = new ValidateUserTO();
        validateUserTO.setValidate(user.equals("Minimi09") && pswd.equals("1234"));
        return (validateUserTO);
    }

    @Override
    public FormularioTO alta(FormularioTO formularioTO) {
        return formularioTO;
    }
}
