package org.mwage.math.core_components;
/**
 * ��Ԫ������ʽ��
 * ӵ��һ��������Լ������ߵı��ʽ������ұߵı��ʽ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_BinaryOperation extends I_Expression {
	/**
	 * ��ȡ��������ʽ�����������������Ǹ���Ԫ�����
	 * 
	 * @return �����
	 * @since 1
	 * @version 1
	 */
	I_BinaryOperator p_getOperator();
	/**
	 * ��ȡ�����ߵı��ʽ��
	 * 
	 * @return �����ߵı��ʽ��
	 * @since 1
	 * @version 1
	 */
	I_Expression p_getLeft();
	/**
	 * ��ȡ����ұߵı��ʽ��
	 * 
	 * @return ����ұߵı��ʽ��
	 * @since 1
	 * @version 1
	 */
	I_Expression p_getRight();
	/**
	 * @return "(��߱��ʽ)���(�ұ߱��ʽ)"��
	 * @since 1
	 * @version 1
	 */
	default String m_toFileString() {
		String str =  "(" + p_getLeft().m_toFileString() + ")";
		str += p_getOperator().m_toFileString();
		str += "(" + p_getRight().m_toFileString() + ")";
		return str;
	}
	
}