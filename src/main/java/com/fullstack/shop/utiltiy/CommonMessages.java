package com.fullstack.shop.utiltiy;

public class CommonMessages {
	
//------------------HTTP STATUS ERROR MESSAGE メッセージ------------------
	//UNAUTHORIZED
	public static final String APIRSER0001 = "APIRSER0001";
	//CONFLICT
	public static final String APIRSER0002 = "APIRSER0002";
//------------------HTTP STATUS INFO MESSAGE メッセージ------------------
	//SUCCESS
	public static final String APIRSIF0001 = "APIRSIF0001";
	//CREATED
	public static final String APIRSIF0002 = "APIRSIF0002";

//	------------------共通情報　ERRORメッセージ------------------
	//ユーザログインが失敗しました。
	public static final String KYOTUER0001 = "KYOTUER0001";
	//ユーザが存在しません！
	public static final String KYOTUER0002 = "KYOTUER0002";
	//ユーザログインが失敗しました！
	public static final String KYOTUER0003 = "KYOTUER0003";
//	------------------共通情報　INFOメッセージ------------------
	//ユーザログインが成功しました。
	public static final String KYOTUIF0001 = "KYOTUIF0001";
//------------------管理者-商品カテゴリ情報 ERROR メッセージ------------------
	//商品カテゴリー登録が失敗しました。
	public static final String SHCTGER0001 = "SHCGER0001";
	// 商品カテゴリー名を入力してください。
	public static final String SHCTGER0002 = "SHCGER0002";
	// 商品カテゴリー更新が失敗しました。
	public static final String SHCTGER0003 = "SHCGER0003";
	//商品カテゴリー削除が失敗しました。
	public static final String SHCTGER0004 = "SHCGER0004";
	//商品カテゴリーIDを入力してください。
	public static final String SHCTGER0005 = "SHCGER0005";

//------------------管理者-商品カテゴリ情報　INFO メッセージ------------------
	//	商品カテゴリー登録が正常に完了しました。
	public static final String SHCAGIF0001 = "SHCAGIF0001";
	//	商品名前が必要です。
	public static final String SHCAGIF0002 = "SHCAGIF0002";
	//	商品コードが必要です。
	public static final String SHCAGIF0003 = "SHCAGIF0003";
	//	商品タイトルが必要です。
	public static final String SHCAGIF0004 = "SHCAGIF0004";
	//	商品カテゴリー更新が正常に完了しました。
	public static final String SHCAGIF0005 = "SHCAGIF0005";
	//	商品カテゴリーが削除されました。
	public static final String SHCAGIF0006 = "SHCAGIF0006";
//	------------------管理者-商品サブカテゴリー情報 ERROR メッセージ--------------
	//	商品サブカテゴリー登録が失敗しました。
	public static final String SHSUBER0001 = "SHSUBER0001";
	//	商品サブカテゴリー名を入力してください。
	public static final String SHSUBER0002 = "SHSUBER0002";
	//	商品サブカテゴリー更新が失敗しました。
	public static final String SHSUBER0003 = "SHSUBER0003";
	//	商品サブカテゴリー削除が失敗しました。
	public static final String SHSUBER0004 = "SHSUBER0004";
	//	商品サブカテゴリーIDが指定されていません。商品サブカテゴリーIDを入力してください。
	public static final String SHSUBER0005 = "SHSUBER0005";

//	------------------管理者-商品サブカテゴリー情報 INFO メッセージ--------------
	//	商品サブカテゴリー情報一覧取得が完成しました。
	public static final String SHSUBIF0001 = "SHSUBIF0001";
	//	商品サブカテゴリー情報取得が完成しました。
	public static final String SHSUBIF0002 = "SHSUBIF0002";
	//	商品サブカテゴリー登録が正常に完了しました。
	public static final String SHSUBIF0003 = "SHSUBIF0003";
	//	商品サブカテゴリー更新が正常に完了しました。
	public static final String SHSUBIF0004 = "SHSUBIF0004";
	//	商品サブカテゴリーが削除されました。
	public static final String SHSUBIF0005 = "SHSUBIF0005";
//	#------------------管理者-商品情報 ERROR メッセージ--------------

//	#------------------管理者-商品情報 INFO メッセージ---------------

//	#------------------管理者-商品写真 ERROR メッセージ--------------

//	#------------------管理者-商品写真 INFO メッセージ---------------
	//	商品写真取得が正常に完了しました。
	public static final String SHSHNIF0001 = "SHSHNIF0001";
	//	商品写真アプロードが正常に完了しました。
	public static final String SHSHNIF0002 = "SHSHNIF0002";
	
	//	商品写真更新が正常に完了しました。
	public static final String SHSHNIF0003 = "SHSHNIF0003";
	

//	#------------------管理者-商品返品 ERROR メッセージ--------------
	//	商品写真アプロードが失敗しました。
	public static final String SHHKKER0001 = "SHHKKER0001";
	//	商品IDが指定されていません。商品IDを入力してください。
	public static final String SHHKKER0002 = "SHHKKER0002";
	//	商品の写真が空です。商品の写真を選択してください。
	public static final String SHHKKER0003 = "SHHKKER0003";
	//	商品IDが必要です。
	public static final String SHHKKER0004 = "SHHKKER0004";
	//	タイトルが必要です。
	public static final String SHHKKER0005 = "SHHKKER0005";
	//	ルール名が必要です。
	public static final String SHHKKER0006 = "SHHKKER0006";
	//	商品返却の商品返却ルール登録が失敗しました。
	public static final String SHHKKER0007 = "SHHKKER0007";
	//	商品写真取得が失敗しました。
	public static final String SHHKKER0008 ="SHHKKER0008";
	//	商品写真更新が失敗しました。
	public static final String SHHKKER0010 ="SHHKKER0010";
	//	------------------管理者-商品返品 INFO メッセージ--------------
	//商品返却の商品返却ルール登録が正常に完了しました。
	public static final String SHHKKIF0001 = "SHHKKIF0001";
	//API のレスポンスの　商品返品ルールID です。
	public static final String SHHKKIF0002 = "SHHKKIF0002";
	//API のレスポンスの　商品IDです。
	public static final String SHHKKIF0003 = "SHHKKIF0003";
	//API のレスポンスの　タイトルです。
	public static final String SHHKKIF0004 = "SHHKKIF0004";
	//API のレスポンスの　ルールです。
	public static final String SHHKKIF0005 = "SHHKKIF0005";
	//API のレスポンスの　登録日時です。
	public static final String SHHKKIF0006 = "SHHKKIF0006";
	//API のレスポンスの　更新日時です。
	public static final String SHHKKIF0007 = "SHHKKIF0007";
	//商品返却の商品返却ルール削除が正常に完了しました。
	public static final String SHHKKIF0008 = "SHHKKIF0008";
//	------------------管理者-商品レビュー ERROR メッセージ--------------
	//	商品レビューID が　必要です。
	public static final String SHHPNER0001 = "SHHPNER0001";
	//商品返品ルールID  が　必要です。
	public static final String SHHPNER0002 = "SHHPNER0002";
//	------------------管理者-商品レビュー INFO メッセージ----------------

//	------------------管理者-ユーザ商品定期購入 ERROR メッセージ------------------

//	------------------管理者-ユーザ商品定期購入 INFO メッセージ------------------
	
//	------------------管理者-管理者権限利用者 ERROR メッセージ------------------
	//管理者情報一覧を取得しました。
	public static final String UROLEER0001 = "UROLEER0001";
	//管理者情報一覧を取得できない。
	public static final String UROLEER0002 = "UROLEER0002";
	//管理者情報を登録しました。
	public static final String UROLEER0003 = "UROLEER0003";
	//カタカナで入力してください。
	public static final String UROLEER0004 = "UROLEER0004";
	//正しいメールを入力してください。
	public static final String UROLEER0005 = "UROLEER0005";
	//正しい電話番後を入力してください。
	public static final String UROLEER0006 = "UROLEER0006";
	//管理者情報登録が失敗しました。
	public static final String UROLEER0007 = "UROLEER0007";
	//ユーザ名が必要です。
	public static final String UROLEER0008 = "UROLEER0008";
	//ユーザ名カナが必要です。
	public static final String UROLEER0009 = "UROLEER0009";
	//メールが必要です。
	public static final String UROLEER0010 = "UROLEER0010";
	//権限が必要です。
	public static final String UROLEER0011 = "UROLEER0011";
	//電話番号が必要です。
	public static final String UROLEER0012 = "UROLEER0012";
	//管理者情報を更新しました。
	public static final String UROLEER0013 = "UROLEER0013";
	//管理者情報更新が失敗しました。
	public static final String UROLEER0014 = "UROLEER0014";
	//管理者情報を削除しました。
	public static final String UROLEER0015 = "UROLEER0015";
	//ユーザIDがないです。
	public static final String UROLEER0016 = "UROLEER0016";
	//管理者情報削除が失敗しました。
	public static final String UROLEER0017 = "UROLEER0017";
//	------------------管理者-管理者権限利用者 INFO メッセージ------------------
	
//	------------------管理者-お客様情報設定 ERROR メッセージ------------------
	//パスワードが必要です。
	public static final String CUMERER0001 = "CUMERER0001";
	//ユーザコードが必要です。
	public static final String CUMERER0002 = "CUMERER0002";
	//メールが必要です。
	public static final String CUMERER0003 = "CUMERER0003";
	//メールのフォマードが正しくありません。
	public static final String CUMERER0004 = "CUMERER0004";
	//メールが存在しています。
	public static final String CUMERER0005 = "CUMERER0005";
	//ユーザ名が必要です。
	public static final String CUMERER0006 = "CUMERER0006";
	//生年月日が必要です。
	public static final String CUMERER0007 = "CUMERER0007";
	//生年月日のフォマードが正しくありません。
	public static final String CUMERER0008 = "CUMERER0008";
	//電話番号が必要です。
	public static final String CUMERER0009 = "CUMERER0009";
	//電話番号のフォマードが正しくありません。
	public static final String CUMERER0010 = "CUMERER0010";
	//ユーザIDが必要です。
	public static final String CUMERER0011 = "CUMERER0011";
//	------------------管理者-お客様情報設定 INFO メッセージ------------------
	//ログインが正常に完了しました。
	public static final String CUMERIF0001 = "CUMERIF0001";
	//パスワード変更が完成しました。
	public static final String CUMERIF0002 = "CUMERIF0002";
	//お客様情報登録が完成しました。
	public static final String CUMERIF0003 = "CUMERIF0003";
	//お客様情報更新が完了しました。
	public static final String CUMERIF0004 = "CUMERIF0004";
//	------------------管理者-お客様・ポイント ERROR メッセージ------------------
	//ポイント一覧取得が失敗しました。
	public static final String CUPNTER0001 = "CUPNTER0001";
//------------------管理者-お客様・ポイント INFO メッセージ------------------
	//	ポイント一覧取得が完了しました。
	public static final String CUPNTIF0001 = "CUPNTIF0001";
	
//	------------------管理者-マスタ情報設定 ERROR メッセージ------------------
	//マスター名が必要です。
	public static final String MASTRER0001 = "MASTRER0001";
	//マスター名がすでに存在します。
	public static final String MASTRER0002 = "MASTRER0002";
	//マスターが存在しない。
	public static final String MASTRER0003 = "MASTRER0003";
	//名前が必要です。
	public static final String MASTRER0004 = "MASTRER0004";
	//名前がすでに存在します。
	public static final String MASTRER0005 = "MASTRER0005";
	//マスター情報登録が失敗しました。
	public static final String MASTRER0006 = "MASTRER0006";
	//マスター情報報更が失敗しました。
	public static final String MASTRER0007 = "MASTRER0007";
	//マスター削除が失敗しました。
	public static final String MASTRER0008 = "MASTRER0008";
	//スター詳細情報登録が失敗しました。
	public static final String MASTRER0009 = "MASTRER0009";
	//マスター情報一覧取得が失敗しました。
	public static final String MASTRER0010 = "MASTRER0010";
	//マスター詳細IDが指定されていません。マスター詳細IDを入力してください。
	public static final String MASTRER0011 = "MASTRER0011";
	//マスター詳細の削除が失敗しました。
	public static final String MASTRER0012 = "MASTRER0012";
//	------------------管理者-マスタ情報設定 INFO メッセージ------------------
	//マスター情報登録が完成しました。
	public static final String MASTRIF0001 = "MASTRIF0001";
	//マスター情報更新が完了しました。
	public static final String MASTRIF0002 = "MASTRIF0002";
	//マスター情報データを削除しました。
	public static final String MASTRIF0003 = "MASTRIF0003";
	//マスター詳細情報が取得できました。
	public static final String MASTRIF0004 = "MASTRIF0004";
	//マスター詳細情報登録が完成しました。
	public static final String MASTRIF0005 = "MASTRIF0005";
	//マスター詳細情報更新が完了しました。
	public static final String MASTRIF0006 = "MASTRIF0006";
	//マスター詳細情報報更が失敗しました。
	public static final String MASTRIF0007 = "MASTRIF0007";
	//マスター情報一覧取得が完成しました。
	public static final String MASTRIF0008 = "MASTRIF0008";
	//マスター詳細情報データの削除が完成しました。
	public static final String MASTRIF0009 = "MASTRIF0009";
//	------------------管理者-在庫 ERROR メッセージ------------------
	
//	------------------管理者-在庫 INFO メッセージ------------------
	//在庫管理の在庫の在庫取得が正常に完了しました。
	public static final String ZIKOKIF0001 = "ZIKOKIF0001";
	//在庫登録は完了しました。
	public static final String ZIKOKER0002 = "ZIKOKER0002";
	//在庫管理の在庫の在庫削除が正常に完了しました。
	public static final String ZIKOKER0003 = "ZIKOKER0003";
	//在庫管理更新が完了しました。
	public static final String ZIKOKER0004 = "ZIKOKER0004";
	//API のレスポンスの　取引種類 です。
	public static final String ZIKOKER0005 = "ZIKOKER0005";
	//API のレスポンスの　数量 です。
	public static final String ZIKOKER0006 = "ZIKOKER0006";
	//API のレスポンスの　登録日時 です。
	public static final String ZIKOKER0007 = "ZIKOKER0007";
	//API のレスポンスの　担当 です。
	public static final String ZIKOKER0008 = "ZIKOKER0008";
	//API のレスポンスの　注文ID です。
	public static final String ZIKOKER0009 = "ZIKOKER0009";
	//API のレスポンスの　ユーザコード です。
	public static final String ZIKOKER0010 = "ZIKOKER0010";
	//API のレスポンスの　ユーザ名 です。
	public static final String ZIKOKER0011 = "ZIKOKER0011";
	//API のレスポンスの　注文数 です。
	public static final String ZIKOKER0012 = "ZIKOKER0012";
	//API のレスポンスの　登録日時 です。
	public static final String ZIKOKER0013 = "ZIKOKER0013";
//	------------------管理者-在庫輸入情報 ERROR メッセージ------------------

//	------------------管理者-在庫輸入情報 INFO メッセージ-------------------
	//商品量を入力してください。
	public static final String ZKYNYIF0001 = "ZKYNYIF0001";
	//商品量のフォーマットが間違っています。
	public static final String ZKYNYIF0002 = "ZKYNYIF0002";
	//取引ステータスを入力してください。
	public static final String ZKYNYIF0003 = "ZKYNYIF0003";
	//倉庫取引情報削除が失敗しました。
	public static final String ZKYNYIF0004 = "ZKYNYIF0004";

//	------------------管理者-在庫輸出情報 ERROR メッセージ------------------

//	------------------管理者-在庫輸出情報 INFO メッセージ-------------------
	
//	------------------管理者-支払情報 ERROR メッセージ------------------
	//支払情報取得が失敗しました。
	public static final String SHRJHER0001 = "SHRJHER0001";
//	------------------管理者-支払情報 INFO メッセージ-------------------
	
//	------------------管理者-注文情報 ERROR メッセージ------------------
	//サービス料パーセントが必要です。
	public static final String CHMJHER0001 = "CHMJHER0001";
	//取引種類が必要です。
	public static final String CHMJHER0002 = "CHMJHER0002";
	//取引ステータスが必要です。
	public static final String CHMJHER0003 = "CHMJHER0003";
	//商品量が必要です。
	public static final String CHMJHER0004 = "CHMJHER0004";
	//支払サービスIDが必要です。
	public static final String CHMJHER0005 = "CHMJHER0005";
	//名前が必要です。
	public static final String CHMJHER0006 = "CHMJHER0006";
	//サービス料パーセントが必要です。
	public static final String CHMJHER0007 = "CHMJHER0007";
	//写真のサイズはサイズ制限未満である必要があります。
	public static final String CHMJHER0008 = "CHMJHER0008";
	//写真のタイプは「jpg、png」である必要があります。
	public static final String CHMJHER0009 = "CHMJHER0009";
	//決済サービスの支払情報設定登録が失敗しました。
	public static final String CHMJHER0010 = "CHMJHER0010";
	//決済サービスの支払情報更新が失敗しました。
	public static final String CHMJHER0011 = "CHMJHER0011";
	//決済サービスの支払情報削除が失敗しました。
	public static final String CHMJHER0012 = "CHMJHER0012";
	//決済サービスの支払アカウント情報取得が失敗しました。
	public static final String CHMJHER0013 = "CHMJHER0013";
	//決済サービスの支払アカウント情報登録が失敗しました。
	public static final String CHMJHER0014 = "CHMJHER0014";
	//引取アカウント情報IDが必要です。
	public static final String CHMJHER0015 = "CHMJHER0015";
	//支払サービスIDが必要です。
	public static final String CHMJHER0016 = "CHMJHER0016";
	//住所IDが必要です。
	public static final String CHMJHER0017 = "CHMJHER0017";
	//引取ユーザ名が必要です。
	public static final String CHMJHER0018 = "CHMJHER0018";
	//引取電話番号が必要です。
	public static final String CHMJHER0019 = "CHMJHER0019";
	//アカウントNoが必要です。
	public static final String CHMJHER0020 = "CHMJHER0020";
	//決済サービスの支払アカウント情報更新が失敗しました。
	public static final String CHMJHER0021 = "CHMJHER0021";
	//注文ID が必要です。
	public static final String CHMJHER0022 = "CHMJHER0022";
//	------------------管理者-注文情報 INFO メッセージ-------------------
	//決済サービスの支払情報設定登録が正常に完了しました。
	public static final String CHMJHIF0001 = "CHMJHIF0001";
	//決済サービスの支払情報更新が失敗しました。
	public static final String CHMJHIF0002 = "CHMJHIF0002";
	//決済サービスの支払情報削除が正常に完了しました。
	public static final String CHMJHIF0003 = "CHMJHIF0003";
	//決済サービスの支払アカウント情報取得が正常に完了しました。
	public static final String CHMJHIF0004 = "CHMJHIF0004";
	//決済サービスの支払アカウント情報登録が正常に完了しました。
	public static final String CHMJHIF0005 = "CHMJHIF0005";
	//決済サービスの支払アカウント情報更新が正常に完了しました。
	public static final String CHMJHIF0006 = "CHMJHIF0006";
	//API のレスポンスの　支払サービスIDです。
	public static final String CHMJHIF0007 = "CHMJHIF0007";
	//API のレスポンスのサービス　名前です。
	public static final String CHMJHIF0008 = "CHMJHIF0008";
	//API のレスポンスのサービス　写真です。
	public static final String CHMJHIF0009 = "CHMJHIF0009";
	//API のレスポンスのサービス料パーセントです。
	public static final String CHMJHIF0010 = "CHMJHIF0010";
	//API のレスポンスの　引取アカウント情報IDです。
	public static final String CHMJHIF0011 = "CHMJHIF0011";
	//API のレスポンスの 支払サービスIDです。
	public static final String CHMJHIF0012 = "CHMJHIF0012";
	//API のレスポンスの 住所IDです。
	public static final String CHMJHIF0013 = "CHMJHIF0013";
	//API のレスポンスの 引取ユーザ名です。
	public static final String CHMJHIF0014 = "CHMJHIF0014";
	//API のレスポンスのサービス　支払サービスIDです。
	public static final String CHMJHIF0015 = "CHMJHIF0015";
	//API のレスポンスの アカウントNoです。
	public static final String CHMJHIF0016 = "CHMJHIF0016";
	//API のレスポンスの 登録日時です。
	public static final String CHMJHIF0017 = "CHMJHIF0017";
	//API のレスポンスの 更新日時です。
	public static final String CHMJHIF0018 = "CHMJHIF0018";
//	------------------管理者-お客様パスワード変更 ERROR メッセージ------------------
	//パスワードが必要です。
	public static final String PAHKOER0001 = "PAHKOER0001";
	//パスワード変更が失敗しました。
	public static final String PAHKOER0002 = "PAHKOER0002";
//	------------------管理者-お客様パスワード変更 INFO メッセージ-------------------
	//パスワード変更が完成しました。
	public static final String PAHKOIF0001 = "PAHKOIF0001";
//	------------------管理者-カート ERROR メッセージ------------------
	
//	------------------管理者-カート INFO メッセージ------------------
	//カート情報取得が完成しました。
	public static final String CTDATIF0001 = "CTDATIF0001";
	//カート詳細の更新が完成しました。
	public static final String CTDATIF0002 = "CTDATIF0002";
	//カート詳細の削除が完成しました。
	public static final String CTDATIF0003 = "CTDATIF0003";
//	------------------管理者-注文 ERROR メッセージ------------------
	//カート情報取得が失敗しました。
	public static final String CHUMNER0001 = "CHUMNER0001";
	//カート詳細の更新が失敗しました。
	public static final String CHUMNER0002 = "CHUMNER0002";
	//定期購入を入力してください。
	public static final String CHUMNER0003 = "CHUMNER0003";
	//商品量を入力してください。
	public static final String CHUMNER0004 = "CHUMNER0004";
	//カート詳細の削除が失敗しました。
	public static final String CHUMNER0005 = "CHUMNER0005";
	//カート詳細IDが指定されていません。カート詳細IDを入力してください。
	public static final String CHUMNER0006 = "CHUMNER0006";
	//商品レビューを登録が失敗しました。
	public static final String CHUMNER0007 = "CHUMNER0007";
	//タイトルが空の場合、エラーメッセージを表示する。
	public static final String CHUMNER0008 = "CHUMNER0008";
	//レビューが空の場合、エラーメッセージを表示する。
	public static final String CHUMNER0009 = "CHUMNER0009";
	//ランクが空の場合、エラーメッセージを表示する。
	public static final String CHUMNER0010 = "CHUMNER0010";
	//注文ステータスが１～５以外を入力する場合、エラーメッセージを表示する。
	public static final String CHUMNER0011 = "CHUMNER0011";
//	------------------管理者-注文 INFO メッセージ------------------

//	------------------管理者-住所 ERROR メッセージ------------------
	//住所削除が失敗しました。
	public static final String ADDRSER0001 = "ADDRSER0001";
//	------------------管理者-住所 INFO メッセージ------------------
}
