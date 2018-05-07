package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class PermissionTO implements Serializable {

    private long idPermission;

    private String permissionType;

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
