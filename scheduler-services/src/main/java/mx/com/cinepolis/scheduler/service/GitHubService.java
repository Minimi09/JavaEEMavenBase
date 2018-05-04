package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.FormularioTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.ValidateUserTO;

public interface GitHubService {

    GitHubUserTO getUser (String login);
    ValidateUserTO getUserQueryString (String user, String pswd);
    FormularioTO alta(FormularioTO formularioTO);
}
