package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.FormularioTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.ValidateUserTO;
import mx.com.cinepolis.scheduler.service.GitHubService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class GitHubFacadeEJB {
    @Inject
    GitHubService gitHubService;

    public GitHubUserTO getUser (String login)
    {
     return gitHubService.getUser(login);
    }

    public ValidateUserTO getUserQueryString (String user, String pswd)
    {
        return gitHubService.getUserQueryString(user, pswd);
    }

    public FormularioTO alta (FormularioTO formularioTO)
    {
        return gitHubService.alta(formularioTO);
    }
}
