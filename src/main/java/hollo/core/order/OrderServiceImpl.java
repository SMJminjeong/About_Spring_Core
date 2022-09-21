package hollo.core.order;

import hollo.core.discount.DiscountPolicy;
import hollo.core.discount.FixDisountPolicy;
import hollo.core.member.Member;
import hollo.core.member.MemberRepository;
import hollo.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDisountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        //할인은 discountPolicy 너가 알아서 해 -> 단일 책임의 원칙
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
