package org.mwage.math.core_components.algebra.simple_operations;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * �����ʽ�������������㡣
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface ��_ArithmeticOperations {
	/**
	 * �������㡣
	 * 
	 * @param a
	 *            ������ߵĲ�����
	 * @param b
	 *            �����ұߵĲ�����
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression calc(I_AlgebraicExpression a, I_AlgebraicExpression b);
}