package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 会员卡内容更新事件
 * 当用户的会员卡积分余额发生变动时，微信会推送事件告知开发者
 *
 * @author Shinez.
 */
public class RecvUpdateMemberCardEvent extends RecvEvent {
    private static final long serialVersionUID = -57254023737174302L;
    /**
     * 卡券ID
     */
    private String cardId;
    /**
     * code序列号
     */
    private String userCardCode;
    /**
     * 变动的积分值
     */
    private Integer modifyBonus;
    /**
     * 变动的余额值
     */
    private Integer modifyBalance;

    protected RecvUpdateMemberCardEvent() {
    }

    public RecvUpdateMemberCardEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public Integer getModifyBonus() {
        return modifyBonus;
    }

    public void setModifyBonus(Integer modifyBonus) {
        this.modifyBonus = modifyBonus;
    }

    public Integer getModifyBalance() {
        return modifyBalance;
    }

    public void setModifyBalance(Integer modifyBalance) {
        this.modifyBalance = modifyBalance;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserCardCode() {
        return userCardCode;
    }

    public void setUserCardCode(String userCardCode) {
        this.userCardCode = userCardCode;
    }

    @Override
    public String getEventType() {
        return RecvEventType.UPDATE_MEMBER_CARD.value();
    }
}
