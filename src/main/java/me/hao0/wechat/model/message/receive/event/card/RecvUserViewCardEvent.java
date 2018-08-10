package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 进入会员卡事件推送
 * 用户在进入会员卡时，微信会把这个事件推送到开发者填写的URL
 *
 * @author Shinez.
 */
public class RecvUserViewCardEvent extends RecvEvent {
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
     * 商户自定义二维码渠道参数，用于标识本次扫码打开会员卡来源来自于某个渠道值的二维码
     */
    private String outerStr;

    protected RecvUserViewCardEvent() {

    }

    public RecvUserViewCardEvent(RecvEvent e) {
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

    public String getOuterStr() {
        return outerStr;
    }

    public void setOuterStr(String outerStr) {
        this.outerStr = outerStr;
    }

    @Override
    public String getEventType() {
        return RecvEventType.USER_VIEW_CARD.value();
    }
}
