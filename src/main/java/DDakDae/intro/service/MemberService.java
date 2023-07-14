package DDakDae.intro.service;

import DDakDae.intro.domain.Member;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public interface MemberService {

    Long join(Member member);
    void validateDuplicateMember(Member member);
    List<Member> findMembers();
    Optional<Member> findOne(Long memberId);
}
