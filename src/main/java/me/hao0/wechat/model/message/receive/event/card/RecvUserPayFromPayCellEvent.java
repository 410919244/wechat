package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 买单事件推送
 * 微信买单完成时，微信会把这个事件推送到开发者填写的URL
 *
 * @author Shinez.
 */
public class RecvUserPayFromPayCellEvent extends RecvEvent {
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
     * 是否转赠退回，0代表不是，1代表是
     */
    private Boolean isReturnBack;
    /**
     * 微信支付交易订单号（只有使用买单功能核销的卡券才会出现）
     */
    private String transId;
    /**
     * 门店ID，当前卡券核销的门店ID（只有通过卡券商户助手和买单核销时才会出现）
     */
    private String locationId;
    /**
     * 实付金额，单位为分
     */
    private Integer fee;
    /**
     * 应付金额，单位为分
     */
    private Integer originalFee;

    protected RecvUserPayFromPayCellEvent() {

    }

    public RecvUserPayFromPayCellEvent(RecvEvent e) {
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

    public Boolean getReturnBack() {
        return isReturnBack;
    }

    public void setReturnBack(Boolean returnBack) {
        isReturnBack = returnBack;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getOriginalFee() {
        return originalFee;
    }

    public void setOriginalFee(Integer originalFee) {
        this.originalFee = originalFee;
    }

    @Override
    public String getEventType() {
        return RecvEventType.USER_PAY_FROM_PAY_CELL.value();
    }
}
