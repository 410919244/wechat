package me.hao0.wechat.model.card.qrcode;

import lombok.Data;

/**
 * 创建卡券二维码返回
 *
 * @author zJun
 * @date 2017年12月14日 上午10:50:32
 */
@Data
public class ResultQrcode {

    /**
     * 0 成功
     */
    private Integer errcode;
    /**
     * ok 成功
     */
    private String errmsg;
    /**
     * 获取ticket后需调用换取二维码接口获取二维码图片，详情见字段说明。
     */
    private String ticket;
    private Integer expire_seconds;
    /**
     * 二维码图片解析后的地址，开发者可根据该地址自行生成需要的二维码图片
     */
    private String url;
    /**
     * 二维码显示地址，点击后跳转二维码页面
     */
    private String show_qrcode_url;

}
