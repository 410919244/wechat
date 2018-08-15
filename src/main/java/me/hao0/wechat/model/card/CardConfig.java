package me.hao0.wechat.model.card;

import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.hao0.common.util.Strings;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardConfig {
	
	/** 卡券id */
	private String cardId;
	/** 扩展字段 */
	private String cardExt;

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Conf {
		/** 指定的卡券code码，只能被领一次。自定义code模式的卡券必须填写，非自定义code和预存code模式的卡券不必填写。详情见： 是否自定义code码 */
		private String code;
		/** 指定领取者的openid，只有该用户能领取。bind_openid字段为true的卡券必须填写，bind_openid字段为false不必填写。 */
		private String openid;
		/** 时间戳，商户生成从1970年1月1日00:00:00至今的秒数,即当前的时间,且最终需要转换为字符串形式;由商户生成后传入,不同添加请求的时间戳须动态生成，若重复将会导致领取失败！。 */
		private String timestamp;
		/** 随机字符串，由开发者设置传入， 加强安全性（若不填写可能被重放请求） 。随机字符串，不长于32位。推荐使用大小写字母和数字，不同添加请求的nonce须动态生成，若重复将会导致领取失败。 */
		private String nonce_str;
		/** 卡券在第三方系统的实际领取时间，为东八区时间戳（UTC+8,精确到秒）。当卡券的有效期类型为 DAT E_TYPE_FIX_TERM时专用，标识卡券的实际生效时间，用于解决商户系统内起始时间和领取时间不同步的问题。 */
		private Integer fixed_begintimestamp;
		/** 领取渠道参数，用于标识本次领取的渠道值。 */
		private String outer_str;
		/** 签名，商户将接口列表中的参数按照指定方式进行签名,签名方式使用SHA1,具体签名方案参见下文;由商户按照规范签名后传入。 */
		private String signature;
		
		/**
		 * 返回需要加密的字符串
		 * @param cardId
		 * @param apiTicket
		 * @return
		 * @author zJun
		 * @date 2018年8月8日 下午3:44:45
		 */
		public String signStr(String cardId, String apiTicket) {
			TreeSet<String> treeSet =new TreeSet<>();
	        treeSet.add(str(apiTicket));
	        treeSet.add(str(timestamp));
	        treeSet.add(str(nonce_str));
	        treeSet.add(str(cardId));
	        treeSet.add(str(code));
	        treeSet.add(str(openid));
			
	        StringBuilder signStr = new StringBuilder("");
	        for (String s : treeSet) {
	            signStr.append(s);
	        }
			return signStr.toString();
		}
		
		/**
		 * 如果str是null返回空字符串
		 * @param str
		 * @return
		 * @author zJun
		 * @date 2018年8月8日 下午3:17:16
		 */
		public String str(String str) {
			if(Strings.isNullOrEmpty(str)) {
				return "";
			}
			return str;
		}
	}
	
	
}
