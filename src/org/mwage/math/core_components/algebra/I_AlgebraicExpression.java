package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.I_Expression;
/**
 * �������ʽ�����Խ����������㡣
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_AlgebraicExpression extends I_Expression {
	/**
	 * �ӷ����㡣Ӧ�����пɽ����ԡ�
	 * 
	 * @param another
	 *            ������
	 * @return �µĴ������ʽ�����μӷ��ĺ͡�
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_add(I_AlgebraicExpression another);
	/**
	 * �������㡣
	 * 
	 * @param another
	 *            ������
	 * @return �µĴ������ʽ�����μ����Ĳ
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_sub(I_AlgebraicExpression another);
	/**
	 * �˷����㡣Ӧ�����пɽ����ԡ�
	 * 
	 * @param another
	 *            ������
	 * @return �µĴ������ʽ�����γ˷��Ļ���
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_mut(I_AlgebraicExpression another);
	/**
	 * �������㡣
	 * 
	 * @param another
	 *            ������
	 * @return �µĴ������ʽ�����γ������̡�
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_div(I_AlgebraicExpression another);
	/**
	 * ����ֵ���㡣
	 * <p>
	 * �����������һ������������򷵻�һ�����������
	 * �����������һ�����ʽ���򷵻�һ��abs������
	 * 
	 * @return �µĴ������ʽ�����������ʽ�ľ���ֵ��
	 * @since 1
	 * @version 1
	 */
	I_AlgebraicExpression o_abs();
}