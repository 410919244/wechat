package me.hao0.wechat.model.message.receive.event.scan;

import me.hao0.wechat.model.message.receive.event.RecvEvent;

/**
 * 商品审核结果推送
 * 提交审核的商品，完成审核后，微信会将审核结果以事件的形式推送到商户填写的URL。
 *
 * @author Shinez.
 */
public class RecvUserScanProductVerifyActionEvent extends RecvEvent {


    private static final long serialVersionUID = -606460059187924474L;
    /**
     * 审核结果。verify_ok表示审核通过，verify_not_pass表示审核未通过。
     */
    private String result;
    /**
     * 审核未通过的原因。
     */
    private String reasonMsg;

    protected RecvUserScanProductVerifyActionEvent() {

    }

    public RecvUserScanProductVerifyActionEvent(RecvEvent e) {
        super(e);
        this.eventType = e.getEventType();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReasonMsg() {
        return reasonMsg;
    }

    public void setReasonMsg(String reasonMsg) {
        this.reasonMsg = reasonMsg;
    }

    @Override
    public String getEventType() {
        return RecvGoodsScanEventType.USER_SCAN_PRODUCT_VERIFY_ACTION.value();
    }

}
