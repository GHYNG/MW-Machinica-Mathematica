package org.mwage.math.core_components;
/**
 * 关于各种算符的枚举，主要是为了储存它们的字符串形态。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public enum E_Operator {
	/**
	 * 加法。
	 * 
	 * @since 1
	 * @version 1
	 */
	ADD("+"),
	/**
	 * 减法。
	 * 
	 * @since 1
	 * @version 1
	 */
	SUB("-"),
	/**
	 * 乘法。
	 * 
	 * @since 1
	 * @version 1
	 */
	MUT("*"),
	/**
	 * 除法。
	 * 
	 * @since 1
	 * @version 1
	 */
	DIV("/"),
	/**
	 * 等于。
	 * 
	 * @since 1
	 * @version 1
	 */
	EQU("="),
	/**
	 * 大于。
	 * 
	 * @since 1
	 * @version 1
	 */
	MOR(">"),
	/**
	 * 小于。
	 * 
	 * @since 1
	 * @version 1
	 */
	LES("<"),
	/**
	 * 与。
	 * 
	 * @since 1
	 * @version 1
	 */
	AND("AND"),
	/**
	 * 或。
	 * 
	 * @since 1
	 * @version 1
	 */
	OR("OR"),
	/**
	 * 非。
	 * 
	 * @since 1
	 * @version 1
	 */
	NOT("NOT");
	private final String fileString;
	E_Operator(String fileString) {
		this.fileString = fileString;
	}
	/**
	 * 获得这种算符的字符串形态。
	 * 这些字符串用于写入文件。
	 * 
	 * @return 该算符的字符串形态。
	 */
	public String m_toFileString() {
		return fileString;
	}
}