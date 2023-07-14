package DDakDae.intro;

import DDakDae.intro.repository.JdbcMemberRepository;
import DDakDae.intro.repository.JdbcTemplateMemberRepository;
import DDakDae.intro.repository.MemberRepository;
import DDakDae.intro.repository.MemoryMemberRepository;
import DDakDae.intro.service.MemberService;
import DDakDae.intro.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
