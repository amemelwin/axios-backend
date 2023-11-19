package com.fullstack.shop.utiltiy;

public class CommonData {
	public static final String BLANK = "";
	public static final String DATE_FORMAT_YYYYMMDD = "yyyy-MM-dd";
	public static final String DATE_FORMAT_YYYYMM_NIHON = "yyyy年MM月";	
	public static final String TIME_FORMAT = "yyyy/MM/dd H:mm:ss";
	public static final String TIME_FORMAT2 = "H:mm";
	public static final String TIME_FORMAT3 = "HH:mm:ss";
	public static final String EXPENSE_STATUS_REGEX_PATTERN = "[1234567]";
	public static final String USERPOINT_STATUS_REGEX_PATTERN = "[12]";
	public static final String SUBSCRIBE_STATUS_REGEX_PATTERN = "[01]";
	public static final String ORDERDECLINE_STATUS_REGEX_PATTERN = "[123]";
	public static final String ORDERDECLINE_TYPE_REGEX_PATTERN = "[12]";
	public static final String DATE_FORMAT_REGEX_PATTERN = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";//DATE FORMAT(YYYY-MM-DD)
	public static final String MAIL_REGEX_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	public static final String PHONE_REGEX_PATTERN_JP = "^(\\+81|0)[1-9]\\d{8,9}$";
	public static final String INTERNATIONAL_PHONE_REGEX_PATTERN = "\\+(9[976]\\d|8[987530]\\d|6[987]\\d|5[90]\\d|42\\d|3[875]\\d|\n"
			+ "2[98654321]\\d|9[8543210]|8[6421]|6[6543210]|5[87654321]|\n"
			+ "4[987654310]|3[9643210]|2[70]|7|1)\\d{1,14}$";
	public static final String INTERNATIONAL_PH_REGEX_PTTERN= "^[+]{1}(?:[0-9\\-\\(\\)\\/\\.]\\s?){6, 15}[0-9]{1}$";
    public static final String AUTHORITY_REGEX_PATTERN = "[1234]";
	public static final String USER_STATUS_REGEX_PATTERN = "[01]";
	public static final String USER_ROLE_REGEX_PATTERN = "[123]";
	public static final String ORDER_STATUS_REGEX_PATTERN = "[1234]";
	public static final String JAPANESE_POSTAL_CODE_REGEX_PATTERN = "^\\d{7}$";
	public static final String TRANSACTION_TYPE_REGEX_PATTERN = "[12]";
	public static final String TRANSACTION_STATUS_REGEX_PATTERN = "[12345]";
	public static final String MAIN_PHOTO_STATUS_REGEX_PATTERN = "[01]";
	public static final String PRODUCT_STATUS_REGEX_PATTERN = "[01]";
	public static final String REGEX_ALPHABET = "^[A-Za-z]+$" ; 
	public static final String REGEX_ALPHANUM = "^[A-Za-z0-9]+$" ;
}
