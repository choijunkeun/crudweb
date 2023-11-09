package jkchoi.crudweb.repository;

import jkchoi.crudweb.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
