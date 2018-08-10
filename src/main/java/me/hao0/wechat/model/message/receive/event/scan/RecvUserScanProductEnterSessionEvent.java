package me.hao0.wechat.model.message.receive.event.scan;

/**
 * 进入公众号事件推送
 * 当用户从商品主页进入公众号会话时，微信会推送该事件到商户填写的URL。推送的内容包括用户的基本信息、时间、关注场景及对应的条码信息。
 *
 * @author Shinez.
 */
public class RecvUserScanProductEnterSessionEvent extends RecvUserScanProductEvent {


    private static final long serialVersionUID = 3174415356023181767L;

    protected RecvUserScanProductEnterSessionEvent() {

    }

    public RecvUserScanProductEnterSessionEvent(RecvUserScanProductEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }


    @Override
    public String getEventType() {
        return RecvGoodsScanEventType.USER_SCAN_PRODUCT_ENTER_SESSION.value();
    }

}
