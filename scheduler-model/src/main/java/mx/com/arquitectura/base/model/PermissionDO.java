package mx.com.arquitectura.base.model;

import javax.persistence.*;

@Entity
@Table (name = "C_PERMISOS")
public class PermissionDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERMISO")
    private long idPermission;

    @Column(name = "TIPO_PERMISO")
    private String permissionType;

    @Column(name = "PERMISO")
    private String permissions;

    public long getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(long idPermission) {
        this.idPermission = idPermission;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}
