package DDakDae.intro.service;

import DDakDae.intro.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Long join(Member member);
    void validateDuplicateMember(Member member);
    List<Member> findMembers();
    Optional<Member> findOne(Long memberId);
}
