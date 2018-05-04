package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

/**
 * @author ohurtado
 */

public class UserTO implements Serializable {

   //Este es el objeto que voy a pasar , entre el despliegue y mis componentes
    private static final long serialVersionUID = -8853482566070472169L;

    private Long idUser;

    private String login;

    private String avatarUrl;

    private String name;

    private int followers;

    private int following;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }
}
