package DDakDae.intro.repository;

import DDakDae.intro.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Interface가 상속받을 때는 extends
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
