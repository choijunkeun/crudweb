package jkchoi.crudweb.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String memberName;
    private String password;
    private String nickname;
    private String email;


    @Builder
    public Member(String memberName, String password, String nickname, String email) {
        this.memberName = memberName;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
    }


}
