package jkchoi.crudweb.service;


import jkchoi.crudweb.dto.MemberDto;
import jkchoi.crudweb.entity.Member;
import jkchoi.crudweb.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberDto.JoinMemberResponse join(MemberDto.JoinMemberRequest request) {
        Member joinMember = memberRepository.save(request.toEntity());
        return new MemberDto.JoinMemberResponse(joinMember);
    }

}
