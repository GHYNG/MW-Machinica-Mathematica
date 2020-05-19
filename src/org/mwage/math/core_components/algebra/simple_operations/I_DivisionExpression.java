package org.mwage.math.core_components.algebra.simple_operations;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperation;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * 一个除法表达式。
 * 它的核心应该是一个除号（/），
 * 以及两个表达除数和被除数的代数表达式。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_DivisionExpression extends I_AlgebraicBinaryOperation {
	/**
	 * 获取该除法表达式的分子。
	 * 
	 * @return 整数，此表达式的分子。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_getNumerator();
	/**
	 * 获取该除法表达式的分母。
	 * 
	 * @return 整数，此表达式的分母。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_getDenominator();
	/**
	 * @since 1
	 * @version 1
	 */
	default I_AlgebraicExpression p_calculate() {
		return p_getNumerator().o_div(p_getDenominator());
	}
}