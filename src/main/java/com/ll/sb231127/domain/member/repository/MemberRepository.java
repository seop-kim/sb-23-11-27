package com.ll.sb231127.domain.member.repository;

import com.ll.sb231127.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
