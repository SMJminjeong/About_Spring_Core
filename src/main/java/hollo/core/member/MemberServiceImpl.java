package hollo.core.member;

//관례상 Impl 사용
public class MemberServiceImpl implements MemberService{

    //구현체가 없으면 null이 되기 때문에 구현체를 생성해줘야 한다.
    private final MemberRepository memberRepository = new MemoryMemberRepository(); //실제 할당하는 부분이 구현체
    //추상화에도 의존하고 구체화에도 의존 = bad = DIP 를 위반하고 있음.

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
