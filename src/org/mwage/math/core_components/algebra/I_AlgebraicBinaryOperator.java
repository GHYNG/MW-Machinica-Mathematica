package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.I_BinaryOperator;
import org.mwage.math.core_components.I_Expression;
import static org.mwage.math.core_components.Util_CommonConstantValues.*;
import static org.mwage.math.core_components.algebra.Util_ABO.*;
import org.mwage.math.core_components.E_Operator;
/**
 * ������Ԫ�����
 * 
 * @author GHYNG
 */
public interface I_AlgebraicBinaryOperator extends I_AlgebraicOperator, I_BinaryOperator {
	/**
	 * �ӷ��������+����
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
	 * �������㣬���һ�����ʽ��
	 * 
	 * @param a
	 *            ��ߵĲ�����
	 * @param b
	 *            �ұߵĲ�����
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_operate(I_AlgebraicExpression a, I_AlgebraicExpression b);
	/**
	 * @return ��������ַ�����ʽ������operators.get()��
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