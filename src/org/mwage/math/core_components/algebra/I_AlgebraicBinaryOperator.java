package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.I_BinaryOperator;
import org.mwage.math.core_components.I_Expression;
import static org.mwage.math.core_components.Util_CommonConstantValues.*;
import static org.mwage.math.core_components.algebra.Util_ABO.*;
import org.mwage.math.core_components.E_Operator;
/**
 * 代数二元算符。
 * 
 * @author GHYNG
 */
public interface I_AlgebraicBinaryOperator extends I_AlgebraicOperator, I_BinaryOperator {
	/**
	 * 加法运算符“+”。
	 * 
	 * @since 1
	 */
	I_AlgebraicBinaryOperator adder = new AddOperator();
	/**
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_AlgebraicExpression p_operate(I_Expression a, I_Expression b) {
		if(a instanceof I_AlgebraicExpression && b instanceof I_AlgebraicExpression) {
			I_AlgebraicExpression aa = (I_AlgebraicExpression)a, bb = (I_AlgebraicExpression)b;
			return p_operate(aa, bb);
		}
		return NaN;
	}
	/**
	 * 进行运算，获得一个表达式。
	 * 
	 * @param a
	 *            左边的参数。
	 * @param b
	 *            右边的参数。
	 * @return 运算结果。
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_operate(I_AlgebraicExpression a, I_AlgebraicExpression b);
	/**
	 * @return 运算符的字符串形式。调用operators.get()。
	 * @since 1
	 * @version 1
	 */
	@Override
	String m_toFileString();
}
class AddOperator implements I_AlgebraicBinaryOperator {
	@Override
	public String m_toFileString() {
		return ope_add;
	}
	@Override
	public I_AlgebraicExpression p_operate(I_AlgebraicExpression a, I_AlgebraicExpression b) {
		return a.o_add(b);
	}
}
class Util_ABO { 
	static String ope_add = E_Operator.ADD.m_toFileString();
	
}