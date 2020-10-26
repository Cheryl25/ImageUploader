/*
 * Comments 
 */
package ImageHoster.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "text", columnDefinition = "TEXT")
    private String text;

    @Column(name = "createdDate")
    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "image_id")
    private Image image;

    /*
     * Returns ID
     */
    public Integer getId() {
        return id;
    }

    /*
     * Sets ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /*
     * Returns text
     */
    public String getText() {
        return text;
    }

    /*
     * Sets Text
     */
    public void setText(String text) {
        this.text = text;
    }

    /*
     * Returns Date
     */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    /*
     * Sets Date
     */
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    /*
     * Returns User
     */
    public User getUser() {
        return user;
    }

    /*
     * Sets User
     */
    public void setUser(User user) {
        this.user = user;
    }

    /*
     * Returns Image
     */
    public Image getImage() {
        return image;
    }

    /*
     * Sets Image
     */
    public void setImage(Image image) {
        this.image = image;
    }
}
