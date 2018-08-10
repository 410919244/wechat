package me.hao0.wechat.model.message.receive.event;

/**
 * 门店审核事件推送
 * @author Shinez.
 */
public class RecvPoiCheckNotifyEvent extends RecvEvent {

    private static final long serialVersionUID = 50677774466229911L;
    /**
     * 商户自己内部ID，即字段中的sid
     */
    private String uniqId;
    /**
     * 微信的门店ID，微信内门店唯一标示ID
     */
    private String poiId;
    /**
     * 审核结果，成功succ 或失败fail
     */
    private String result;
    /**
     * 成功的通知信息，或审核失败的驳回理由
     */
    private String msg;

    @SuppressWarnings("unused")
	private RecvPoiCheckNotifyEvent() {
    	
    }

    public RecvPoiCheckNotifyEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getUniqId() {
        return uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId;
    }

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getEventType() {
        return RecvEventType.POI_CHECK_NOTIFY.value();
    }
}
