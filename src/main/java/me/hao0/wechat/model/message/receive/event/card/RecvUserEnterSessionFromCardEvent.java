package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 从卡券进入公众号会话事件推送
 * 用户在卡券里点击查看公众号进入会话时（需要用户已经关注公众号），微信会把这个事件推送到开发者填写的URL。开发者可识别从卡券进入公众号的用户身份
 *
 * @author Shinez.
 */
public class RecvUserEnterSessionFromCardEvent extends RecvEvent {
    private static final long serialVersionUID = -57254023737174302L;
    /**
     * 卡券ID
     */
    private String cardId;
    /**
     * code序列号
     */
    private String userCardCode;

    protected RecvUserEnterSessionFromCardEvent() {

    }

    public RecvUserEnterSessionFromCardEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
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
        return RecvEventType.USER_ENTER_SESSION_FROM_CARD.value();
    }
}
