package org.mwage.math.core_components;
/**
 * 数学系统中的关键字。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public enum E_Keyword {
	/**
	 * 真。
	 * 
	 * @since 1
	 */
	TRUE("true"),
	/**
	 * 假。
	 * 
	 * @since 1
	 */
	FALSE("false"),
	/**
	 * 与。
	 * 
	 * @since 1
	 */
	AND("and"),
	/**
	 * 或。
	 * 
	 * @since 1
	 */
	OR("or"),
	/**
	 * 非。
	 * 
	 * @since 1
	 */
	NOT("not"),
	/**
	 * 空
	 * 
	 * @since 1
	 */
	NULL("null"),
	/**
	 * 非法数值。
	 * 
	 * @since 1
	 */
	NaN("NaN");
	private final String fileString;
	E_Keyword(String fileString) {
		this.fileString = fileString;
	}
	/**
	 * 这些关键字被写入文件的形式。
	 * 
	 * @return 关键字的字符串。
	 */
	public String m_toFileString() {
		return fileString;
	}
}