package hollo.core.discount;

import hollo.core.member.Grade;
import hollo.core.member.Member;

public class FixDisountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
