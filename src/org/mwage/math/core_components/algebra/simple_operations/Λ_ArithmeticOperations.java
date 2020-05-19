package org.mwage.math.core_components.algebra.simple_operations;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * Λ表达式。代表四则运算。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface Λ_ArithmeticOperations {
	/**
	 * 四则运算。
	 * 
	 * @param a
	 *            符号左边的参数。
	 * @param b
	 *            符号右边的参数。
	 * @return 运算结果。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression calc(I_AlgebraicExpression a, I_AlgebraicExpression b);
}