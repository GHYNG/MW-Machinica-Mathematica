package org.mwage.math.core_components;
/**
 * ��ѧϵͳ�еĶ�Ԫ��������������������������
 * <p>
 * ��Щ���������ߺ��ұ��������룬����ӷ���
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_BinaryOperator extends I_MathObject {
	/**
	 * �������㣬���һ�����ʽ��
	 * 
	 * @param left
	 *            �������ߵı��ʽ��
	 * @param right
	 *            ������ұߵı��ʽ��
	 * @return �����õ��ı��ʽ��
	 * @throws IllegalComponentForExpressionException
	 *             �ԷǷ��ı��ʽ�������㡣
	 * @since 1
	 * @version 1
	 */
	I_Expression p_operate(I_Expression left, I_Expression right) throws IllegalComponentForExpressionException;
}
