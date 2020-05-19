package org.mwage.math.core_components;
/**
 * 数学系统中的二元运算符，是最常见和特殊的运算符。
 * <p>
 * 这些运算符有左边和右边两个输入，比如加法。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_BinaryOperator extends I_MathObject {
	/**
	 * 进行运算，获得一个表达式。
	 * 
	 * @param left
	 *            运算符左边的表达式。
	 * @param right
	 *            运算符右边的表达式。
	 * @return 运算后得到的表达式。
	 * @throws IllegalComponentForExpressionException
	 *             对非法的表达式进行运算。
	 * @since 1
	 * @version 1
	 */
	I_Expression p_operate(I_Expression left, I_Expression right) throws IllegalComponentForExpressionException;
}
