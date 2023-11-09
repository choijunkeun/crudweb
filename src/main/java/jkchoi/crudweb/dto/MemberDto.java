package jkchoi.crudweb.dto;

import jkchoi.crudweb.entity.Member;
import lombok.Builder;
import lombok.Data;

public class MemberDto {

    // Create
    @Data
    @Builder
    public static class JoinMemberRequest {
        private String memberName;
        private String password;
        private String nickname;
        private String email;

        public Member toEntity() {
            return Member.builder()
                    .memberName(memberName)
                    .password(password)
                    .nickname(nickname)
                    .email(email)
                    .build();
        }
    }

    @Data
    public static class JoinMemberResponse {
        private Long id;

        public JoinMemberResponse(Member member) {
            this.id = member.getId();
        }
    }

    // Update, Delete
    @Data
    @Builder
    public static class MemberUpdateRequest {

    }


}
