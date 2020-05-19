package org.mwage.math.core_components;
/**
 * 二元计算表达式。
 * 拥有一个算符，以及算符左边的表达式、算符右边的表达式。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_BinaryOperation extends I_Expression {
	/**
	 * 获取此运算表达式的算符，这个操作符是个二元算符。
	 * 
	 * @return 算符。
	 * @since 1
	 * @version 1
	 */
	I_BinaryOperator p_getOperator();
	/**
	 * 获取算符左边的表达式。
	 * 
	 * @return 算符左边的表达式。
	 * @since 1
	 * @version 1
	 */
	I_Expression p_getLeft();
	/**
	 * 获取算符右边的表达式。
	 * 
	 * @return 算符右边的表达式。
	 * @since 1
	 * @version 1
	 */
	I_Expression p_getRight();
	/**
	 * @return "(左边表达式)算符(右边表达式)"。
	 * @since 1
	 * @version 1
	 */
	default String m_toFileString() {
		String str =  "(" + p_getLeft().m_toFileString() + ")";
		str += p_getOperator().m_toFileString();
		str += "(" + p_getRight().m_toFileString() + ")";
		return str;
	}
	
}