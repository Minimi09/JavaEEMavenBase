package mx.com.arquitectura.base.model;

import javax.persistence.*;

@Entity
@Table( name = "K_USER")
public class UserExamDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_USER")
    private Long idUser;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "PWD")
    private String password;
    @Column(name = "ID_PERMISO")
    private long idPermission;
    @Column(name = "USUARIO")
    private String user;

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
