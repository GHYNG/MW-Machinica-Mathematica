package org.mwage.math.core_components.logic;
import org.mwage.math.core_components.I_Expression;
/**
 * ��ѧϵͳ�е��߼����ʽ��
 * ���ֱ��ʽ�ֱ�����Ϊ��ʽϵͳ��Formal Language���е��ж������⣨Decision Problem����
 * ��������Ļش��ǡ��ǡ��򡰷񡱡�
 * ����ж����������������һ������ĺ�����
 * ����������һ���ַ����������Ǵ���ʽ�ĵ�ʽ�������������ж���������жϣ���
 * ����ǲ���ֵ��true/false����
 * <p>
 * ע�⣡һ���߼����ʽ�����������壺
 * ��ֵ���жϼ����Ľ������
 * ���壨�˱��ʽ��ʵ�ϵĺ��壩��
 * ���ڱ�����߶�����org.mwage.math.core_components.algebra��������
 * ���ô������ǻ���Ƥ��ŵ����ϵͳ�ġ�
 * ��������п��ܵĺϷ��ַ����У����������Ϸ��ַ�������
 * �ܴ���ĳһ���ַ�����
 * ���ĺ���Ϊ�棬���ǲ��ɱ��жϣ�����������㣩Ϊ�档���ֱ����������걸�ԡ���
 * �κ��뱾���������ͬԭ�����ѧϵͳ��
 * ֻҪ�ں�Ƥ��ŵ����ϵͳ��
 * ��Ȼ���ǲ��걸�ģ���¶����걸������
 * 
 * @see <a href="https://zh.wikipedia.org/wiki/%E4%B8%8D%E5%8F%AF%E5%88%A4%E5%AE%9A%E9%97%AE%E9%A2%98%E5%88%97%E8%A1%A8">�����ж������б�</a>
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_LogicExpression extends I_Expression {
	/**
	 * ������㡣Ӧ�����н����ԡ�
	 * 
	 * @param another
	 *            ��һ���߼����ʽ��
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_equ(I_LogicExpression another);
	/**
	 * �����㡣Ӧ�����н����ԡ�
	 * 
	 * @param another
	 *            ��һ���߼����ʽ��
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_and(I_LogicExpression another);
	/**
	 * �����㡣Ӧ�����н����ԡ�
	 * 
	 * @param another
	 *            ��һ���߼����ʽ��
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_or(I_LogicExpression another);
	/**
	 * �����㡣
	 * 
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_not();
	/**
	 * �жϴ˱��ʽ�Ĵ𰸡��൱�ڼ��㡣
	 * �ܴ����޷��жϵı��ʽ��
	 * 
	 * @return �жϽ����
	 */
	I_Boolean o_decide();
}