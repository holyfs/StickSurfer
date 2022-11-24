package stick.surfer.Stick.Surfer.user;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private Long lastScore;
    private Long maxScore;
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(Long id, Long lastScore, Long maxScore, String name, String email, String password) {
        this.id = id;
        this.lastScore = lastScore;
        this.maxScore = maxScore;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(Long lastScore, Long maxScore, String name, String email, String password) {
        this.lastScore = lastScore;
        this.maxScore = maxScore;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLastScore() {
        return lastScore;
    }

    public void setLastScore(Long lastScore) {
        this.lastScore = lastScore;
    }

    public Long getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Long maxScore) {
        this.maxScore = maxScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastScore=" + lastScore +
                ", maxScore=" + maxScore +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
