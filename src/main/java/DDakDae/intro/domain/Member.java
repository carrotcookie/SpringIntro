package DDakDae.intro.domain;

import jakarta.persistence.*;

@Entity
public class Member {
    
    // DB에서 id를 자동으로 생성해주는 전략
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
