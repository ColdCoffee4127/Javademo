package com.coffee.pojo;

/**
 * @ClassName Role
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 09:37
 * @Version 1.0
 **/
public class Role {
    private String roleNo;
    private String roleName;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleNo='" + roleNo + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
