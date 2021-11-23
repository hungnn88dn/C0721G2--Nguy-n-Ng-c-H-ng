package exercise.blog.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Ecommerce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Pattern(regexp = "[A-Z]{1}\\w{1,}",message = "Chu cai dau viet hoa")
    private String name;

    @OneToMany (mappedBy = "eCommerce")
    List<Blog> blogList;

    public Ecommerce() {
    }

    public Ecommerce(int id, @NotBlank @NotEmpty @Pattern(regexp = "[A-Z]{1}\\w{1,}", message = "Chu cai dau viet hoa") String name, List<Blog> blogList) {
        this.id = id;
        this.name = name;
        this.blogList = blogList;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
