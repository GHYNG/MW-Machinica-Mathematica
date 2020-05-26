package org.mwage.math.core_components.algebra;
import static org.mwage.math.core_components.Util_CommonConstantValues.*;
import org.mwage.math.core_components.E_Operator;
import org.mwage.math.core_components.algebra.simple_operations.I_DivisionExpression;
/**
 * ����ϵͳ�е�����������������ʵ����һ�֡�
 * <p>
 * �����������������ıȣ�����������������ɣ����ӡ���ĸ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_RationalNumber extends I_RealNumber, I_DivisionExpression {
	/**
	 * �ӷ����㡣Ӧ�����пɽ����ԡ�
	 * <p>
	 * ������������ӣ�Ӧ������һ����������
	 * 
	 * @param another
	 *            ������
	 * @return �µ������������μӷ��ĺ͡�
	 * @since 1
	 * @version 1
	 */
	default I_RationalNumber o_add(I_RationalNumber another) {
		I_RationalNumber a = this, b = another;
		if(p_containNaN(a, b)) {
			return NaN;
		}
		I_Integer aup = a.p_getLeft(), bup = b.p_getLeft();
		I_Integer adn = a.p_getRight(), bdn = b.p_getRight();
		I_Integer dn = adn.o_mut(bdn);
		I_Integer up = aup.o_mut(bdn).o_add(bup.o_mut(adn));
		return up.o_div(dn);
	}
	/**
	 * �������㡣 ���������������Ӧ������һ����������
	 * 
	 * @param another
	 *            ������
	 * @return �µ������������μ����Ĳ
	 * @since 1
	 * @version 1
	 */
	default I_RationalNumber o_sub(I_RationalNumber another) {
		I_RationalNumber a = this, b = another;
		if(p_containNaN(a, b)) {
			return NaN;
		}
		return o_add(another.o_inv());
	}
	/**
	 * �˷����㡣Ӧ�����пɽ����ԡ� ������������ˣ�Ӧ������һ����������
	 * 
	 * @param another
	 *            ������
	 * @return �µ������������γ˷��Ļ���
	 * @since 1
	 * @version 1
	 */
	default I_RationalNumber o_mut(I_RationalNumber another) {
		I_RationalNumber a = this, b = another;
		if(p_containNaN(a, b)) {
			return NaN;
		}
		I_Integer aup = a.p_getLeft(), bup = b.p_getLeft();
		I_Integer adn = a.p_getRight(), bdn = b.p_getRight();
		I_Integer up = aup.o_mut(bup);
		I_Integer dn = adn.o_mut(bdn);
		return up.o_div(dn);
	}
	/**
	 * �������㡣 ���������������Ӧ������һ����������
	 * 
	 * @param another
	 *            ������
	 * @return �µ������������γ������̣�NaN�����������0.
	 * @since 1
	 * @version 1
	 */
	default I_RationalNumber o_div(I_RationalNumber another) {
		I_RationalNumber a = this, b = another;
		if(p_containNaN(a, b)) {
			return NaN;
		}
		I_Integer aup = a.p_getLeft(), bup = b.p_getLeft();
		I_Integer adn = a.p_getRight(), bdn = b.p_getRight();
		return aup.o_mut(bdn).o_div(adn.o_mut(bup));
	}
	/**
	 * @return �����������෴����
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_RationalNumber o_inv() {
		if(p_containNaN(this)) {
			return NaN;
		}
		Sign sign = p_getSign();
		if(sign == Sign.NEUTRAL) {
			return this;
		}
		sign = sign.o_mut(Sign.NEGATIVE);
		I_Integer numerator = p_getNumerator(), denominator = p_getDenominator();
		return m_create(sign, numerator, denominator);
	}
	/**
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_RationalNumber o_abs() {
		if(p_containNaN(this)) {
			return NaN;
		}
		Sign sign = p_getSign();
		if(sign != Sign.NEGATIVE) {
			return this;
		}
		return o_inv();
	}
	/**
	 * ��ȡ���������ķ��ӡ�
	 * 
	 * @return ���������������ķ��ӡ�
	 * @since 1
	 * @version 1
	 */
	@Override
	I_Integer p_getNumerator();
	/**
	 * ��ȡ���������ķ�ĸ��
	 * 
	 * @return ���������������ķ�ĸ��
	 * @since 1
	 * @version 1
	 */
	@Override
	I_Integer p_getDenominator();
	/**
	 * @return I_Integer getNumerator()��
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Integer p_getLeft() {
		return p_getNumerator();
	}
	/**
	 * @return I_Integer getDenominator()��
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Integer p_getRight() {
		return p_getDenominator();
	}
	/**
	 * @since 1
	 * @version 1
	 */
	@Override
	default String m_toFileString() {
		Sign sign = p_getSign();
		String str = "";
		if(sign == Sign.NEGATIVE) {
			str = Util_RationalNumber.SUB;
		}
		String ope = Util_RationalNumber.DIV;
		str += (p_getLeft().m_toFileString() + ope + p_getRight().m_toFileString());
		return str;
	}
	/**
	 * �жϸ������ַ����Ƿ�Ϸ���
	 * <p>
	 * �Ϸ����ַ������Բ���һ��������ֵ��
	 * 
	 * @param value
	 *            �������ַ�����
	 * @return �棬����Ϸ����٣�������Ϸ���
	 * @since 1
	 * @version 1
	 */
	static boolean m_legal(String value) {
		if(I_Integer.m_legal(value)) {
			return true;
		}
		return false;
	}
	/**
	 * ���ݸ������ַ���������һ��������ֵ��
	 * ������������ֵ����Ϊ������
	 * <p>
	 * ����ַ�����������޶����﷨��
	 * �����ĸ����ܵĲ�����ɣ�
	 * ���ţ���ѡ�������Ҫ������������
	 * ����������
	 * ���ţ���/������
	 * ��ĸ������
	 * ����������﷨�򷵻�NuN��
	 * 
	 * @param value
	 *            �������ַ�����
	 * @return ������������ֵ��
	 * @since 1
	 * @version 1
	 */
	static I_RationalNumber m_create(String value) {
		return null; // TODO unfinished.
	}
	/**
	 * ���ݸ����ķ��ź��ַ���������һ��������ֵ��
	 * �����ַ������ִ����������ľ���ֵ��
	 * ������������ֵ����Ϊ������
	 * <p>
	 * �ַ�����������޶����﷨��
	 * ��������������ɣ�
	 * ����������
	 * ���ţ���/������
	 * ��ĸ������
	 * ����������﷨�򷵻�NaN��
	 * <p>
	 * ���������Neutral�������ȷ�������0��
	 * 
	 * @param sign
	 *            �����ķ��š�
	 * @param absvalue
	 *            �������ַ������������ֵ��
	 * @return ������������ֵ��
	 * @since 1
	 * @version 1
	 */
	static I_RationalNumber m_create(Sign sign, String absvalue) {
		return null; // TODO unfinished.
	}
	/**
	 * ���ݸ����ķ��ź���������������һ��������ֵ��
	 * �������Ķ��弴Ϊ���������ı�ֵ��
	 * <p>
	 * �������Ϊ���ԣ������ȴ�������0��
	 * �����ĸΪ0�������ȴ���NaNֵ��
	 * 
	 * @param sign
	 *            ���š�
	 * @param numerator
	 *            ����������
	 * @param denominator
	 *            ��ĸ������
	 * @return ������������ֵ��
	 * @since 1
	 * @version 1
	 */
	static I_RationalNumber m_create(Sign sign, I_Integer numerator, I_Integer denominator) {
		return null; // TODO unfinished.
	}
}
class Util_RationalNumber {
	static String SUB = E_Operator.SUB.m_toFileString();
	static String DIV = E_Operator.DIV.m_toFileString();
}