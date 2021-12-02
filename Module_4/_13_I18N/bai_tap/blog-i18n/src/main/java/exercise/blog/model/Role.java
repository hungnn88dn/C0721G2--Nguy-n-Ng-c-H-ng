package exercise.blog.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "app_role")
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @Column(name = "role_name", length = 30, nullable = false)
    private String roleName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = { @JoinColumn(name = "rode_id") },
            inverseJoinColumns = {@JoinColumn(name = "user_id") })
    private Set<User> products = new HashSet<>();

    public Role() {
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getProducts() {
        return products;
    }

    public void setProducts(Set<User> products) {
        this.products = products;
    }
}