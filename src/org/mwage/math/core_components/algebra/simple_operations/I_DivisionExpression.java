package org.mwage.math.core_components.algebra.simple_operations;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperation;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * һ���������ʽ��
 * ���ĺ���Ӧ����һ�����ţ�/����
 * �Լ������������ͱ������Ĵ������ʽ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_DivisionExpression extends I_AlgebraicBinaryOperation {
	/**
	 * ��ȡ�ó������ʽ�ķ��ӡ�
	 * 
	 * @return �������˱��ʽ�ķ��ӡ�
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_getNumerator();
	/**
	 * ��ȡ�ó������ʽ�ķ�ĸ��
	 * 
	 * @return �������˱��ʽ�ķ�ĸ��
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