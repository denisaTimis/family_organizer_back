package group.family_organizer.entity;

import javax.persistence.*;

@Entity
@Table (name = "product")
public class Product {

    @Column(name="type")
    private String type;

    @Column(name="id")
    private int id;

    @Id
    @Column(name="text")
    private String text;

    public Product( String type, String text, int id) {
        this.type = type;
        this.text = text;
        this.id = id;
    }

    public Product() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
