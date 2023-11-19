package com.fullstack.shop.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Service;


/**
 * 共有サービス
 * 
 * @author チョー
 *
 */
@Service
@Configurable
public class ServiceUtils {

	/** メッセージ */
	@Autowired
	public MessageSource message;

	/**
	 * メッセージの取得（paramなし）
	 * 
	 * @param code
	 * @return
	 */
	public String getMessage(String code) {
		String msg = null;
		try {
			msg = message.getMessage(code, null, Locale.JAPANESE);
		} catch (NoSuchMessageException e) {
			e.printStackTrace();
		}
		return msg;
	}

	/**
	 * メッセージの取得（param）
	 * 
	 * @param code
	 * @param param
	 * @return
	 */
	public String getMessage(String code, String param) {
		String msg = null;
		try {
			final String[] params = new String[] { param };
			msg = message.getMessage(code, params, Locale.JAPANESE);
		} catch (NoSuchMessageException e) {
			e.printStackTrace();
		}
		return msg;
	}

	/**
	 * メッセージの取得（param1, param2）
	 * 
	 * @param code
	 * @param param1
	 * @param param2
	 * @return
	 */
	public String getMessage(String code, String param1, String param2) {
		String msg = null;
		try {
			final String[] params = new String[] { param1, param2 };
			msg = message.getMessage(code, params, Locale.JAPANESE);
		} catch (NoSuchMessageException e) {
			e.printStackTrace();
		}
		return msg;
	}

	/**
	 * メッセージの取得（param1, param2, param3）
	 * 
	 * @param code
	 * @param param1
	 * @param param2
	 * @param param3
	 * @return
	 */
	public String getMessage(String code, String param1, String param2, String param3) {
		String msg = null;
		try {
			final String[] params = new String[] { param1, param2, param3 };
			msg = message.getMessage(code, params, Locale.JAPANESE);
		} catch (NoSuchMessageException e) {
			e.printStackTrace();
		}
		return msg;
	}

}
