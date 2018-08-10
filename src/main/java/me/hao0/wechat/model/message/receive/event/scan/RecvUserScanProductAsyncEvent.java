package me.hao0.wechat.model.message.receive.event.scan;

/**
 * 地理位置信息异步推送
 * 当用户打开商品主页，微信会将该用户实时的地理位置信息以异步事件的形式推送到商户填写的URL。商户可利用该信息做数据分析，形成差异化运营方案或指导生产。
 * 推送的地理位置信息为“省”一级，如广东省。由于用户的网速影响，异步推送的响应速度可能较慢
 *
 * @author Shinez.
 */
public class RecvUserScanProductAsyncEvent extends RecvUserScanEvent {


    private static final long serialVersionUID = -456261290454647678L;
    /**
     * 用户的实时地理位置信息（目前只精确到省一级）
     * 可在国家统计局网站查到对应明细：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html
     */
    private String regionCode;

    protected RecvUserScanProductAsyncEvent() {

    }

    public RecvUserScanProductAsyncEvent(RecvUserScanEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public String getEventType() {
        return RecvGoodsScanEventType.USER_SCAN_PRODUCT_ASYNC.value();
    }

}
