package exercise.blog.model;

import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Blog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 45)
    private String topic;


    @Pattern(regexp = "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)", message = "Viet hoa dau chu,moi chu phai cach nhau")
    private String author;


   @ManyToOne (targetEntity = Ecommerce.class)
    private Ecommerce eCommerce;

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Ecommerce geteCommerce() {
        return eCommerce;
    }

    public void seteCommerce(Ecommerce eCommerce) {
        this.eCommerce = eCommerce;
    }
}
