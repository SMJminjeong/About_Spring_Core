package hollo.core.member;

//관례상 Impl 사용
public class MemberServiceImpl implements MemberService{

    //구현체가 없으면 null이 되기 때문에 구현체를 생성해줘야 한다.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
