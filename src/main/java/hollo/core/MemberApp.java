package hollo.core;

import hollo.core.member.Grade;
import hollo.core.member.Member;
import hollo.core.member.MemberService;
import hollo.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "minjeong", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("New member = "+ member.getName());
        System.out.println("Find Member = "+ findMember.getName());
    }
}
