package me.hao0.wechat.model.message.receive.event.scan;

/**
 * 打开商品主页事件推送
 * 当用户打开商品主页，无论是通过扫码，还是从其他场景（会话、收藏或朋友圈）打开，微信均会推送该事件到商户填写的URL。推送的内容包括用户基本信息，以及商品主页对应的码信息。
 *
 * @author Shinez.
 */
public class RecvUserScanProductEvent extends RecvUserScanEvent {


    private static final long serialVersionUID = -3119657387277116696L;
    /**
     * 调用“获取商品二维码接口”时传入的extinfo，为标识参数。
     */
    private String extInfo;

    protected RecvUserScanProductEvent() {

    }

    public RecvUserScanProductEvent(RecvUserScanEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    @Override
    public String getEventType() {
        return RecvGoodsScanEventType.USER_SCAN_PRODUCT.value();
    }

}
