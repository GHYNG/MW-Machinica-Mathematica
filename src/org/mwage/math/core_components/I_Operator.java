package org.mwage.math.core_components;
/**
 * 数学运算符，本身并不构成表达式。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Operator extends I_MathObject {
	/**
	 * 该算符的文件字符串形式。
	 * 
	 * @return 该算符的字符串形式，用于写入文件。
	 * @since 1
	 * @version 1
	 */
	@Override
	String m_toFileString();
}