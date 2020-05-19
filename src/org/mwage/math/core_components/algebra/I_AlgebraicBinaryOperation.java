package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.I_BinaryOperation;
import org.mwage.math.core_components.algebra.simple_operations.��_ArithmeticOperations;
/**
 * ������Ԫ������ʽ��
 * ����ӷ�ʽ������ʽ��
 * 
 * @author GHYNG
 */
public interface I_AlgebraicBinaryOperation extends I_AlgebraicExpression, I_BinaryOperation {
	/**
	 * @return ���������
	 * @since 1
	 * @version 1
	 */
	@Override
	I_AlgebraicBinaryOperator p_getOperator();
	/**
	 * @return �����ߵĴ������ʽ��
	 * @since 1
	 * @version 1
	 */
	@Override
	I_AlgebraicExpression p_getLeft();
	/**
	 * @return ����ұߵĴ������ʽ��
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression p_getRight();
}