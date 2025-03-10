/*
 * AJD4JP
 * Copyright (c) 2011  Akira Terasaki
 * このファイルは同梱されているLICENSEに定めた条件に
 * 同意できる場合にのみ利用可能です。
 */
package ajd4jp.format;

import ajd4jp.*;


/**
 * 秒のフォーマット。
 */
public class SecondF extends Format {
	/**
	 * コンストラクタ。
	 * @param num 数値表記。
	 */
	public SecondF( Two num ) {
		super( num );
	}

	/**
	 * コンストラクタ。new SecondF( new TwoHalfArabia( '0' ) ) と等価です。
	 */
	public SecondF() {
		this( new TwoHalfArabia( '0' ) );
	}

	int getNum( ajd4jp.Day date ) {
		return date.getSecond();
	}
}

