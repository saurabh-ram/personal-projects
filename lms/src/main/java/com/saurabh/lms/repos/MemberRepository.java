package com.saurabh.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabh.lms.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
