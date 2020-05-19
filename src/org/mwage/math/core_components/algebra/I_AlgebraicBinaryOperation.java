package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.I_BinaryOperation;
import org.mwage.math.core_components.algebra.simple_operations.Λ_ArithmeticOperations;
/**
 * 代数二元计算表达式。
 * 比如加法式、减法式。
 * 
 * @author GHYNG
 */
public interface I_AlgebraicBinaryOperation extends I_AlgebraicExpression, I_BinaryOperation {
	/**
	 * @return 代数算符。
	 * @since 1
	 * @version 1
	 */
	@Override
	I_AlgebraicBinaryOperator p_getOperator();
	/**
	 * @return 算符左边的代数表达式。
	 * @since 1
	 * @version 1
	 */
	@Override
	I_AlgebraicExpression p_getLeft();
	/**
	 * @return 算符右边的代数表达式。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_getRight();
}