package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class UserExamTO implements Serializable {

    private static final long serialVersionUID = -8853482566070472169L;

    private Long idUser;

    private String name;

    private String password;

    private String user;

    private long idPermission;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(long idPermission) {
        this.idPermission = idPermission;
    }
}
