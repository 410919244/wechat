package me.hao0.wechat.model.message.receive.event.card;

import me.hao0.wechat.model.message.receive.event.RecvEvent;
import me.hao0.wechat.model.message.receive.event.RecvEventType;

import java.util.Date;

/**
 * 券点流水详情事件
 * 当商户朋友的券券点发生变动时，微信服务器会推送消息给商户服务器
 *
 * @author Shinez.
 */
public class RecvCardPayOrderEvent extends RecvEvent {
    private static final long serialVersionUID = -57254023737174302L;
    /**
     * 本次推送对应的订单号
     */
    private String orderId;
    /**
     * 本次订单号的状态
     * <p>
     * ORDER_STATUS_WAITING 等待支付
     * ORDER_STATUS_SUCC 支付成功
     * ORDER_STATUS_FINANCE_SUCC 加代币成功
     * ORDER_STATUS_QUANTITY_SUCC 加库存成功
     * ORDER_STATUS_HAS_REFUND 已退币
     * ORDER_STATUS_REFUND_WAITING 等待退币确认
     * ORDER_STATUS_ROLLBACK 已回退,系统失败
     * ORDER_STATUS_HAS_RECEIPT 已开发票
     */
    private String status;
    /**
     * 购买券点时，支付二维码的生成时间 (秒)
     */
    private Date createOrderTime;
    /**
     * 购买券点时，实际支付成功的时间
     */
    private Date payFinishTime;
    /**
     * 支付方式，一般为微信支付充值
     */
    private String desc;
    /**
     * 剩余免费券点数量
     */
    private Integer freeCoinCount;
    /**
     * 剩余付费券点数量
     */
    private Integer payCoinCount;
    /**
     * 本次变动的免费券点数量
     */
    private Integer refundFreeCoinCount;
    /**
     * 本次变动的付费券点数量
     */
    private Integer refundPayCoinCount;
    /**
     * 所要拉取的订单类型
     * ORDER_TYPE_SYS_ADD 平台赠送券点
     * ORDER_TYPE_WXPAY 充值券点
     * ORDER_TYPE_REFUND 库存未使用回退券点
     * ORDER_TYPE_REDUCE 券点兑换库存
     * ORDER_TYPE_SYS_REDUCE 平台扣减
     */
    private String orderType;
    /**
     * 系统备注，说明此次变动的缘由，如开通账户奖励、门店奖励、核销奖励以及充值、扣减。
     */
    private String memo;
    /**
     * 所开发票的详情
     */
    private String receiptInfo;
    protected RecvCardPayOrderEvent() {

    }

    public RecvCardPayOrderEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    public Date getPayFinishTime() {
        return payFinishTime;
    }

    public void setPayFinishTime(Date payFinishTime) {
        this.payFinishTime = payFinishTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getFreeCoinCount() {
        return freeCoinCount;
    }

    public void setFreeCoinCount(Integer freeCoinCount) {
        this.freeCoinCount = freeCoinCount;
    }

    public Integer getPayCoinCount() {
        return payCoinCount;
    }

    public void setPayCoinCount(Integer payCoinCount) {
        this.payCoinCount = payCoinCount;
    }

    public Integer getRefundFreeCoinCount() {
        return refundFreeCoinCount;
    }

    public void setRefundFreeCoinCount(Integer refundFreeCoinCount) {
        this.refundFreeCoinCount = refundFreeCoinCount;
    }

    public Integer getRefundPayCoinCount() {
        return refundPayCoinCount;
    }

    public void setRefundPayCoinCount(Integer refundPayCoinCount) {
        this.refundPayCoinCount = refundPayCoinCount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReceiptInfo() {
        return receiptInfo;
    }

    public void setReceiptInfo(String receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    @Override
    public String getEventType() {
        return RecvEventType.CARD_PAY_ORDER.value();
    }
}
