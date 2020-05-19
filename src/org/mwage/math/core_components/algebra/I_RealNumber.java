package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * ����ϵͳ�е�ʵ����
 * <p>
 * ʵ�����Կ�����һ��ֱ�ߣ����ᣩ�ϵĵ㡣 һ��ʵ�������ж��ֱ�﷽ʽ������1��0.9С��ѭ����ͬһ��ֵ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_RealNumber extends I_Number {
	/**
	 * ���ķ��š����������������㡣
	 * 
	 * @since 1
	 * @version 1
	 */
	public static enum Sign {
		/**
		 * ��ֵ��
		 */
		POSITIVE,
		/**
		 * ��ֵ��
		 */
		NEGATIVE,
		/**
		 * �㡣
		 */
		NEUTRAL;
		/**
		 * ������ˡ�
		 * <p>
		 * �������������������������ø��������ø���������㡣
		 * 
		 * @param another
		 *            ��һ�����š�
		 * @return ��˺�õ��ķ��š�
		 * @since 1
		 * @version 1
		 */
		public Sign o_mut(Sign another) {
			if(this == NEUTRAL || another == NEUTRAL) {
				return NEUTRAL;
			}
			if((this == POSITIVE && another == POSITIVE) || (this == NEGATIVE && another == NEGATIVE)) {
				return POSITIVE;
			}
			if((this == POSITIVE && another == NEGATIVE) || (this == NEGATIVE && another == POSITIVE)) {
				return NEGATIVE;
			}
			return NEUTRAL;
		}
	}
	/**
	 * �жϵ��ڼ��㡣
	 * 
	 * @param another
	 *            ��һ��ʵ����
	 * @return �棬�����ʵ��������һ��ʵ�����٣������ʵ����������һ��ʵ����NaN��������뷽����NaN��
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_equ(I_RealNumber another);
	/**
	 * �жϴ��ڼ��㡣
	 * <p>
	 * ����ʵ���������ϣ����Կ��ԱȽϴ�С��
	 * 
	 * @param another
	 *            ��һ��ʵ����
	 * @return �棬�����ʵ��������һ��ʵ�����٣������ʵ����������һ��ʵ����NaN��������뷽����NaN��
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_mor(I_RealNumber another);
	/**
	 * �ж�С�ڼ��㡣
	 * <p>
	 * ����ʵ���������ϣ����Կ��ԱȽϴ�С��
	 * 
	 * @param another
	 *            ��һ��ʵ����
	 * @return �棬�����ʵ��С����һ��ʵ�����٣������ʵ����С����һ��ʵ����NaN��������뷽����NaN��
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_les(I_RealNumber another);
	/**
	 * �ӷ����㡣Ӧ�����пɽ����ԡ�
	 * <p>
	 * ����ʵ����ӣ�Ӧ������һ��ʵ����
	 * 
	 * @param another
	 *            ������
	 * @return �µ�ʵ�������μӷ��ĺ͡�
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_add(I_RealNumber another);
	/**
	 * �������㡣 ����ʵ�������Ӧ������һ��ʵ����
	 * 
	 * @param another
	 *            ������
	 * @return �µ�ʵ�������μ����Ĳ
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_sub(I_RealNumber another);
	/**
	 * �˷����㡣Ӧ�����пɽ����ԡ� ����ʵ����ˣ�Ӧ������һ��ʵ����
	 * 
	 * @param another
	 *            ������
	 * @return �µ�ʵ�������γ˷��Ļ���
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_mut(I_RealNumber another);
	/**
	 * �������㡣 ����ʵ�������Ӧ������һ��ʵ����
	 * 
	 * @param another
	 *            ������
	 * @return �µ�ʵ�������γ������̣�NaN�����������0.
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_div(I_RealNumber another);
	/**
	 * �ӷ���Ԫ���㡣�ֳ����õ���ʵ�����෴����
	 * <p>
	 * һ���������෴����һ�������෴������ֵ��ͬ�ĸ�����
	 * һ���������෴�������ľ���ֵ��
	 * 0���෴����0��
	 * ÿһ��ʵ��ֻ��ӦΨһ���෴����
	 * ����0��������ʵ����������Ӧ���෴����ϵ��
	 * 
	 * @return ��ʵ�����෴����
	 */
	I_RealNumber o_inv();
	/**
	 * ��ȡ���ʵ���������ԡ�
	 * 
	 * @return ���ʵ���ķ��š�
	 * @since 1
	 * @version 1
	 */
	Sign p_getSign();
	/**
	 * ��ȡ�����������ܻᳬ��Java��double�ڴ淶Χ��
	 * 
	 * @param decimalPlaces
	 *            ��ȷ��С��λ��
	 * @return ��������
	 * @since 1
	 * @version 1
	 */
	double m_round(int decimalPlaces);
}