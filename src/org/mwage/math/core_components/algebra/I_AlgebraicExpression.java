package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.I_Expression;
/**
 * 代数表达式。可以进行四则运算。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_AlgebraicExpression extends I_Expression {
	/**
	 * 加法运算。应当具有可交换性。
	 * 
	 * @param another
	 *            加数。
	 * @return 新的代数表达式：本次加法的和。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_add(I_AlgebraicExpression another);
	/**
	 * 减法运算。
	 * 
	 * @param another
	 *            减数。
	 * @return 新的代数表达式：本次减法的差。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_sub(I_AlgebraicExpression another);
	/**
	 * 乘法运算。应当具有可交换性。
	 * 
	 * @param another
	 *            乘数。
	 * @return 新的代数表达式：本次乘法的积。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_mut(I_AlgebraicExpression another);
	/**
	 * 除法运算。
	 * 
	 * @param another
	 *            除数。
	 * @return 新的代数表达式：本次除法的商。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_div(I_AlgebraicExpression another);
	/**
	 * 绝对值运算。
	 * <p>
	 * 如果本对象是一个具体的数，则返回一个具体的数。
	 * 如果本对象是一个表达式；则返回一个abs函数。
	 * 
	 * @return 新的代数表达式：本代数表达式的绝对值。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_abs();
}