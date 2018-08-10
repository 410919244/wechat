package me.hao0.wechat.model.message.receive.event.menu;

import me.hao0.wechat.model.message.receive.event.RecvEventType;

/**
 * 扫码推事件的事件推送
 *
 * @author Shinez.
 */
public class RecvScancodePushEvent extends RecvMenuEvent {


    private static final long serialVersionUID = 7225852830693739857L;
    /**
     * 扫描信息
     */
    private ScanCodeInfo scanCodeInfo;
    /**
     * 事件KEY值，由开发者在创建菜单时设定
     */
    private String eventKey;

    protected RecvScancodePushEvent() {

    }

    public RecvScancodePushEvent(RecvMenuEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public ScanCodeInfo getScanCodeInfo() {
        return scanCodeInfo;
    }

    public void setScanCodeInfo(ScanCodeInfo scanCodeInfo) {
        this.scanCodeInfo = scanCodeInfo;
    }

    @Override
    public String getEventType() {
        return RecvEventType.SCANCODE_PUSH.value();
    }

    /**
     * 扫描信息
     */
    static class ScanCodeInfo {

        /**
         * 扫描类型，一般是qrcode
         */
        private String scanType;

        /**
         * 扫描结果，即二维码对应的字符串信息
         */
        private String scanResult;

        public String getScanType() {
            return scanType;
        }

        public void setScanType(String scanType) {
            this.scanType = scanType;
        }

        public String getScanResult() {
            return scanResult;
        }

        public void setScanResult(String scanResult) {
            this.scanResult = scanResult;
        }
    }

}
