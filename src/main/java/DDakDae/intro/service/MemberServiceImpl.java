package DDakDae.intro.service;

import DDakDae.intro.domain.Member;
import DDakDae.intro.repository.MemberRepository;
import DDakDae.intro.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    @Override
    public void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
