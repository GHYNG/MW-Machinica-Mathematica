package org.mwage.math.core_components;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * ��ѧ���ʽ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Expression extends I_MathObject {
	/**
	 * ������㡣Ӧ�����н����ԡ�
	 * <p>
	 * �жϴ˱��ʽ�Ƿ���������ʽ���
	 * 
	 * @param another
	 *            ��һ�������ı��ʽ��
	 * @return һ���߼����ʽ��
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_equ(I_Expression another);
	/**
	 * ����˱��ʽ��������ܲ��䣬���ܵõ�һ���µı��ʽ�����ܵõ�һ�������ֵ��
	 * <p>
	 * �����൱�ڽ�ĳһ�����ʽ�򻯵��޷��򻯵ĳ̶ȡ�
	 * 
	 * @return �����Ľ����
	 * @since 1
	 * @version 1
	 */
	I_Expression p_calculate();
	/**
	 * �����ѧ���ʽ������д���ļ������桢�ڲ�������ַ�����ʽ��
	 * <p>
	 * �������Ӧ�þ���˫��Ψһ�ԣ�����
	 * һ�����ʽֻ���ӦΨһ���ַ�����һ���ַ���Ҳֻ���ӦΨһ�ı��ʽ��
	 * 
	 * @return �����ʽ���ַ�����ʽ��
	 * @since 1
	 * @version 1
	 */
	@Override
	String m_toFileString();
}