package model;

import javax.persistence.*;

@Entity
public class Users {
    private String name;
    private long id;
    private Roles rolesByRole;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        if (name != null ? !name.equals(users.name) : users.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    public Roles getRolesByRole() {
        return rolesByRole;
    }

    public void setRolesByRole(Roles rolesByRole) {
        this.rolesByRole = rolesByRole;
    }
}
