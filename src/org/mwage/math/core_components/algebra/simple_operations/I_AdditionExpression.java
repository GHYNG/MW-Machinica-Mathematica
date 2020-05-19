package org.mwage.math.core_components.algebra.simple_operations;
import java.util.ArrayList;
import java.util.List;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperation;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperator;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * �ӷ����ʽ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_AdditionExpression extends I_AlgebraicBinaryOperation, I_MultiAdditionExpression {
	/**
	 * @return �ӷ��������
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_AlgebraicBinaryOperator p_getOperator() {
		return I_AlgebraicBinaryOperator.adder;
	}
	/**
	 * @since 1
	 * @version 1
	 */
	@Override
	default List<I_AlgebraicExpression> p_getAdders() {
		List<I_AlgebraicExpression> list = new ArrayList<I_AlgebraicExpression>();
		list.add(p_getLeft());
		list.add(p_getRight());
		return list;
	}
	/**
	 * @return һ���յļ������б���Ϊ�ӷ����ʽ�в����ڼ����
	 * @since 1
	 * @version 1
	 */
	@Override
	default List<I_AlgebraicExpression> p_getSubers() {
		return new ArrayList<I_AlgebraicExpression>();
	}
	@Override
	default String m_toFileString() {
		// TODO �Զ����ɵķ������
		return I_AlgebraicBinaryOperation.super.m_toFileString();
	}
	/**
	 * �жϸ������ַ����Ƿ�Ϸ���
	 * 
	 * @param value
	 *            �������ַ�����
	 * @return �棬����Ϸ����٣�������Ϸ���
	 */
	static boolean m_legal(String value) {
		return false;
		// TODO unfinished
	}
	/**
	 * ���ݸ������ַ���������һ���µļӷ�ʽ��
	 * 
	 * @param value
	 *            �������ַ�����
	 * @return NaN������ַ������Ϸ���һ���µļӷ�ʽ������ַ����Ϸ���
	 * @since 1
	 * @version 1
	 */
	static I_AdditionExpression m_create(String value) {
		return null;
	}
	/**
	 * ���ݸ����Ĳ���������һ���µļӷ�ʽ��
	 * 
	 * @param left
	 *            �������ߵĴ������ʽ��
	 * @param right
	 *            ������ұߵĴ������ʽ��
	 * @return NaN�������߻��ұߴ���NaN��һ���µļӷ����ʽ��
	 * @since 1
	 * @version 1
	 */
	static I_AdditionExpression m_create(I_AlgebraicExpression left, I_AlgebraicExpression right) {
		return null;
	}
}