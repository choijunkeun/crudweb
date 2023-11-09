package jkchoi.crudweb.controller;


import jakarta.validation.Valid;
import jkchoi.crudweb.dto.MemberDto;
import jkchoi.crudweb.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class MemberController {

    private final MemberService memberService;



    /**
     * 회원가입
     * 1. 가입 성공 시 id반환
     * */
    @PostMapping("/member")
    public ResponseEntity<MemberDto.JoinMemberResponse> joinMember
        (@RequestBody @Valid MemberDto.JoinMemberRequest request) {
        MemberDto.JoinMemberResponse response = memberService.join(request);

        return new ResponseEntity<>(response, HttpStatus.OK);


    }
    /**
     * 회원수정
     * */

    /**
     * 로그인
     * */

    /**
     * 로그아웃
     * */





}
