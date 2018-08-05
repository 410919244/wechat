package me.hao0.wechat.core;

import static me.hao0.common.util.Preconditions.checkNotNullAndEmpty;

import java.util.HashMap;
import java.util.Map;

import me.hao0.wechat.model.card.Card;
import me.hao0.wechat.model.card.CardInfo;
import me.hao0.wechat.model.card.CardStatus;
import me.hao0.wechat.model.card.CodeGet;
import me.hao0.wechat.model.card.Consume;
import me.hao0.wechat.model.card.MemberCardActivateDTO;
import me.hao0.wechat.model.card.Modifystock;
import me.hao0.wechat.model.card.TestWhiteListDTO;
import me.hao0.wechat.model.card.UpdateUserDTO;
import me.hao0.wechat.model.card.UpdateUserResponse;
import me.hao0.wechat.model.card.qrcode.Qrcode;

/**
 * 微信卡券
 *
 * @author zJun
 * @date 2017年12月8日 下午3:37:10
 */
public class Cards extends Component {


    /**
     * 创建卡券
     */
    private static final String CREATE = "https://api.weixin.qq.com/card/create?access_token=";

    /**
     * 创建卡券二维码
     */
    private static final String QRCODE = "https://api.weixin.qq.com/card/qrcode/create?access_token=";

    /**
     * 设置买单接口
     */
    private static final String PAYCELL_SET = "https://api.weixin.qq.com/card/paycell/set?access_token=";

    /**
     * 设置是否开启自助核销功能
     */
    private static final String SELF_CONSUME_CELL = "https://api.weixin.qq.com/card/selfconsumecell/set?access_token=";

    /**
     * 更改卡券信息接口
     */
    private static final String UPDATE = "https://api.weixin.qq.com/card/update?access_token=";
    
    /** 查询Code接口 */
    private static final String GET_CODE = "https://api.weixin.qq.com/card/code/get?access_token=";

    /**
     * 核销Code接口
     */
    private static final String CONSUME = "https://api.weixin.qq.com/card/code/consume?access_token=";

    /**
     * 修改卡券库存接口
     */
    private static final String MODIFYSTOCK = "https://api.weixin.qq.com/card/modifystock?access_token=";

    /**
     * 删除卡券接口
     */
    private static final String DELETE = "https://api.weixin.qq.com/card/delete?access_token=";

    /**
     * 设置卡券失效接口
     */
    private static final String UNAVAILABLE = "https://api.weixin.qq.com/card/code/unavailable?access_token=";

    /**
     * 查询卡券详情
     */
    private static final String GET = "https://api.weixin.qq.com/card/get?access_token=";

    /**
     * 查询卡券列表
     */
    private static final String BATCHGET = "https://api.weixin.qq.com/card/batchget?access_token=";
    
    /**
     * 创建会员卡接口
     */
    private static final String MEMBER_CREATE = "https://api.weixin.qq.com/card/create?access_token=";

    /**
     * 微信card_id
     */
    private static final String CARD_ID = "card_id";


    /**
     * 接口激活会员卡
     */
    private static final String MEMBERCARD_ACTIVATE = "https://api.weixin.qq.com/card/membercard/activate?access_token=";

    /**
     * 设置测试白名单
     */
    private static final String TEST_WHITE_LIST_SET = "https://api.weixin.qq.com/card/testwhitelist/set?access_token=";
    
    /**
     * 更新会员信息
     */
    private static final String UPDATEUSER ="https://api.weixin.qq.com/card/membercard/updateuser?access_token=";

    /**
     * 创建卡券
     * @param card 
     * @return 返回card_id
     * @author zJun
     * @date 2017年12月12日 下午2:36:09
     */
    public String create(Card card) {
        return create(loadAccessToken(), card);
    }

    /**
     * 创建卡券
     * @param accessToken 访问token
     * @param card        卡券
     * @return 返回card_id
     * @author zJun
     * @date 2017年12月11日 下午8:32:04
     */
    public String create(String accessToken, Card card) {
        checkNotNullAndEmpty(accessToken, "accessToken");
        
        String url = CREATE + accessToken;
        Map<String, Object> result = doPost(url, card);
        return result.get(CARD_ID).toString();
    }

    /**
     * 创建卡券二维码投放
     * @param accessToken
     * @param qrcode
     * @author zJun
     * @date 2017年12月14日 上午10:52:04
     */
    public Map<String, Object> createQrcode(String accessToken, Qrcode qrcode) {
        String url = QRCODE + accessToken;
        return doPost(url, qrcode);
    }

    /**
     * 创建卡券二维码
     * @param qrcode
     * @author zJun
     * @date 2017年12月14日 下午2:26:11
     */
    public Map<String, Object> createQrcode(Qrcode qrcode) {
        return createQrcode(loadAccessToken(), qrcode);
    }


    /**
     * 设置卡券是否开启买单功能
     *
     * @param accessToken
     * @param json
     * @author zJun
     * @date 2017年12月14日 下午6:54:01
     */
    public void paycellSet(String accessToken, String json) {
        checkData(accessToken, json);

        String url = PAYCELL_SET + accessToken;
        doPost(url, json);
    }

    /**
     * 设置卡券是否开启买单功能
     *
     * @param json
     * @author zJun
     * @date 2017年12月14日 下午6:57:53
     */
    public void paycellSet(String json) {
        paycellSet(loadAccessToken(), json);
    }

    /**
     * 设置是否开启自助核销
     *
     * @param accessToken
     * @param json
     * @author zJun
     * @date 2017年12月15日 上午10:56:43
     */
    public void selfConsumeCell(String accessToken, String json) {
        checkData(accessToken, json);

        String url = SELF_CONSUME_CELL + accessToken;
        doPost(url, json);
    }

    /**
     * 设置是否开启自助核销
     *
     * @param json
     * @author zJun
     * @date 2017年12月15日 上午10:57:32
     */
    public void selfConsumeCell(String json) {
        selfConsumeCell(loadAccessToken(), json);
    }


    /**
     * 更改卡券信息接口
     * @param accessToken
     * @param cardInfo
     * @author zJun
     * @date 2017年12月18日 下午6:11:03
     */
    public Map<String, Object> update(String accessToken, CardInfo cardInfo) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
        String url = UPDATE + accessToken;
        Map<String, Object> map = doPost(url, cardInfo);
        return map;
    }

    /**
     * 更改卡券信息接口
     * @param cardInfo
     * @author zJun
     * @date 2017年12月18日 下午6:11:03
     */
    public Map<String, Object> update(CardInfo cardInfo) {
       return update(loadAccessToken(), cardInfo);
    }
    
    /**
     * 查询code
     * @param accessToken
     * @param code 卡券code 必填
     * @param cardId 卡券ID 非必填
     * @param checkConsume 是否校验code核销状态 非必填  为true时不能核销将抛出异常
     * @author zJun
     * @date 2018年8月5日 下午5:04:57
     */
    public CodeGet getCode(String accessToken, String code, String cardId, Boolean checkConsume) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
    	checkNotNullAndEmpty(code, "code");
    	
    	Map<String, Object> param = new HashMap<>(3);
    	param.put("code", code);
    	if(cardId != null && cardId.trim().length() > 0) {
    		param.put("card_id", cardId);
    	}
    	if(checkConsume != null) {
    		param.put("check_consume", checkConsume);
    	}
    	
    	String url = GET_CODE + accessToken;
    	return doPost(url, param, CodeGet.class);
    }
    
    /**
     * 查询code
     * @param code 卡券code 必填
     * @param cardId 卡券ID 非必填
     * @param checkConsume 是否校验code核销状态 非必填  为true时不能核销将抛出异常
     * @author zJun
     * @date 2018年8月5日 下午5:04:57
     */
    public CodeGet getCode(String code, String cardId, Boolean checkConsume) {
    	return getCode(loadAccessToken() ,code, cardId, checkConsume);
    }

    /**
     * 核销Code接口
     * @param accessToken
     * @param consume
     * @author zJun
     * @date 2017年12月20日 上午11:41:00
     */
    public Map<String, Object> consume(String accessToken, Consume consume) {
    	checkNotNullAndEmpty(accessToken, "accessToken");

        String url = CONSUME + accessToken;
        return doPost(url, consume);
    }

    /**
     * 核销Code接口
     * @param consume
     * @author zJun
     * @date 2017年12月20日 上午11:41:43
     */
    public Map<String, Object> consume(Consume consume) {
        return consume(loadAccessToken(), consume);
    }

    /**
     * 修改库存接口
     * @param accessToken
     * @param stock
     * @author zJun
     * @date 2017年12月20日 下午5:23:33
     */
    public void modifystock(String accessToken, Modifystock stock) {
    	checkNotNullAndEmpty(accessToken, "accessToken");

        String url = MODIFYSTOCK + accessToken;
        doPost(url, stock);
    }

    /**
     * 修改库存接口
     * @param stock
     * @author zJun
     * @date 2017年12月25日 下午7:21:49
     */
    public void modifystock(Modifystock stock) {
        modifystock(loadAccessToken(), stock);
    }

    /**
     * 删除微信卡券
     * @param accessToken
     * @param cardId
     * @author zJun
     * @date 2017年12月26日 下午3:54:16
     */
    public void delete(String accessToken, String cardId) {
    	checkNotNullAndEmpty(accessToken, "accessToken");

    	Map<String, String> map = new HashMap<String, String>(1);
    	map.put(CARD_ID, cardId);
        String url = DELETE + accessToken;
        doPost(url, map);
    }

    /**
     * 删除微信卡券
     * @param cardId
     * @author zJun
     * @date 2017年12月26日 下午3:54:29
     */
    public void delete(String cardId) {
        delete(loadAccessToken(), cardId);
    }

    /**
     * 设置卡券失效
     * @param accessToken
     * @param cardId 卡券ID。 必填
     * @param code 设置失效的Code码。 必填
     * @param reason 失效理由
     * @author zJun
     * @date 2018年7月27日 下午1:52:27
     */
    public void unavailable(String accessToken, String cardId, String code, String reason) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
    	checkNotNullAndEmpty(cardId, CARD_ID);
    	checkNotNullAndEmpty(code, "code");

    	Map<String, String> map = new HashMap<String, String>(3);
    	map.put(CARD_ID, cardId);
    	map.put("code", code);
    	map.put("reason", reason);
    	
        String url = UNAVAILABLE + accessToken;
        doPost(url, map);
    }

    /**
     * 设置卡券失效
     * @param card_id
     * @param code
     * @param reason
     * @author zJun
     * @date 2018年7月30日 上午9:44:34
     */
    public void unavailable(String card_id, String code, String reason) {
        unavailable(loadAccessToken(), card_id, code, reason);
    }

    /**
     * 批量查询卡券列表
     * @param accessToken
     * @param offset 查询卡列表的起始偏移量，从0开始，即offset: 5是指从从列表里的第六个开始读取。
     * @param count 需要查询的卡片的数量（数量最大50）
     * @param status
     * @return
     * @author zJun
     * @date 2018年7月30日 上午9:57:53
     */
    public Map<String, Object> batchget(String accessToken, Integer offset, Integer count, CardStatus status) {
    	checkNotNullAndEmpty(accessToken, "accessToken");

    	Map<String, Object> map = new HashMap<>(3);
    	map.put("offset", offset);
    	map.put("count", count);
    	map.put("status_list", status);
    	
    	
    	String url = BATCHGET + accessToken;
        return doPost(url, map);
    }

    /**
     * 批量查询卡券列表
     * @param offset 查询卡列表的起始偏移量，从0开始，即offset: 5是指从从列表里的第六个开始读取。
     * @param count 需要查询的卡片的数量（数量最大50）
     * @param status
     * @return
     * @author zJun
     * @date 2018年7月30日 上午11:12:26
     */
    public Map<String, Object> batchget(Integer offset, Integer count, CardStatus status) {
        return batchget(loadAccessToken(), offset, count, status);
    }

    /**
     * 查询卡券详情
     * @param accessToken
     * @param cardId
     * @return
     * @author zJun
     * @date 2018年7月30日 下午2:31:52
     */
    public Map<String, Object> get(String accessToken, String cardId) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
        
    	Map<String, Object> map = new HashMap<>(1);
    	map.put(CARD_ID, cardId);
    	
        String url = GET + accessToken;
        return doPost(url, map);
    }

    /**
     * 查询卡券详情
     * @param cardId
     * @return
     * @author zJun
     * @date 2018年7月30日 下午2:33:19
     */
    public Map<String, Object> get(String cardId) {
        return get(loadAccessToken(), cardId);
    }


    /**
     * 接口激活会员卡
     * @param accessToken
     * @param memberCardActivateDTO
     * @return
     * @author Shinez
     * @data 2018年1月20日 21:21:42
     */
    public void memberCardActivate(String accessToken, MemberCardActivateDTO memberCardActivateDTO) {
        checkNotNullAndEmpty(accessToken, "accessToken");
        assert memberCardActivateDTO != null;
        String url = MEMBERCARD_ACTIVATE + accessToken;
        doPost(url, memberCardActivateDTO);
    }


    /**
     * 接口激活会员卡
     *
     * @param memberCardActivateDTO
     * @return
     * @author Shinez
     * @data 2018年1月20日 21:21:42
     */
    public void memberCardActivate(MemberCardActivateDTO memberCardActivateDTO) {
        memberCardActivate(loadAccessToken(), memberCardActivateDTO);
    }
    
    /**
     * 创建会员卡接口
     * @param accessToken
     * @param card
     * @return
     * @author zJun
     * @date 2018年7月30日 下午2:35:45
     */
    public String memberCreate(String accessToken, Card card) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
    	
        String url = MEMBER_CREATE + accessToken;
        Map<String, Object> result = doPost(url, card);
        return result.get(CARD_ID).toString();
    }
    
    /**
     * 创建会员卡接口
     * @param card
     * @return
     * @author zJun
     * @date 2018年7月30日 下午2:35:53
     */
    public String memberCreate(Card card) {
        return memberCreate(loadAccessToken(), card);
    }
    
    /**
     * 设置测试白名单
     * @author zJun
     * @date 2018年1月22日 下午6:06:58
     */
    public void testWhiteListSet(String accessToken, TestWhiteListDTO param) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
        String url = TEST_WHITE_LIST_SET + accessToken;
        doPost(url, param);
    }
    
    /**
     * 设置测试白名单
     * @author zJun
     * @date 2018年1月22日 下午6:07:36
     */
    public void testWhiteListSet(TestWhiteListDTO param) {
    	testWhiteListSet(loadAccessToken(), param);
    }
    
    /**
     * 更新会员信息
     * @author zJun
     * @date 2018年1月23日 下午3:12:06
     */
    public UpdateUserResponse updateuser(String accessToken, UpdateUserDTO param) {
    	checkNotNullAndEmpty(accessToken, "accessToken");
        String url = UPDATEUSER + accessToken;
        return doPost(url, param, UpdateUserResponse.class);
    }
    
    /**
     * 更新会员信息
     * @author zJun
     * @date 2018年1月23日 下午3:12:06
     */
    public UpdateUserResponse updateuser(UpdateUserDTO param) {
        return updateuser(loadAccessToken(), param);
    }
    
}
