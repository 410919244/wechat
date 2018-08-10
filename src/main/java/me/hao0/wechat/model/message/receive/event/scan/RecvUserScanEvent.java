package me.hao0.wechat.model.message.receive.event.scan;

import me.hao0.wechat.model.message.receive.event.RecvEvent;

/**
 * 打开商品扫一扫事件推送
 *
 * @author Shinez.
 */
public class RecvUserScanEvent extends RecvEvent {


    private static final long serialVersionUID = -5250184720149066799L;
    /**
     * 商品编码标准。
     */
    private String keyStandard;
    /**
     * 商品编码内容。
     */
    private String keyStr;

    protected RecvUserScanEvent() {

    }

    public RecvUserScanEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getKeyStandard() {
        return keyStandard;
    }

    public void setKeyStandard(String keyStandard) {
        this.keyStandard = keyStandard;
    }

    public String getKeyStr() {
        return keyStr;
    }

    public void setKeyStr(String keyStr) {
        this.keyStr = keyStr;
    }
}
