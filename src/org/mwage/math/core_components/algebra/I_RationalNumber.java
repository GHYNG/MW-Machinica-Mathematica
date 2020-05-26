package org.mwage.math.core_components.algebra;
import static org.mwage.math.core_components.Util_CommonConstantValues.*;
import org.mwage.math.core_components.E_Operator;
import org.mwage.math.core_components.algebra.simple_operations.I_DivisionExpression;
/**
 * 代数系统中的有理数。有理数是实数的一种。
 * <p>
 * 有理数是两个整数的比，因此由两个整数构成：分子、分母。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_RationalNumber extends I_RealNumber, I_DivisionExpression {
	/**
	 * 加法运算。应当具有可交换性。
	 * <p>
	 * 两个有理数相加，应当还是一个有理数。
	 * 
	 * @param another
	 *            加数。
	 * @return 新的有理数：本次加法的和。
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
	 * 减法运算。 两个有理数相减，应当还是一个有理数。
	 * 
	 * @param another
	 *            减数。
	 * @return 新的有理数：本次减法的差。
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
	 * 乘法运算。应当具有可交换性。 两个有理数相乘，应当还是一个有理数。
	 * 
	 * @param another
	 *            乘数。
	 * @return 新的有理数：本次乘法的积。
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
	 * 除法运算。 两个有理数相除，应当还是一个有理数。
	 * 
	 * @param another
	 *            除数。
	 * @return 新的有理数：本次除法的商；NaN，如果除数是0.
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
	 * @return 该有理数的相反数。
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
	 * 获取该有理数的分子。
	 * 
	 * @return 整数，此有理数的分子。
	 * @since 1
	 * @version 1
	 */
	@Override
	I_Integer p_getNumerator();
	/**
	 * 获取该有理数的分母。
	 * 
	 * @return 整数，此有理数的分母。
	 * @since 1
	 * @version 1
	 */
	@Override
	I_Integer p_getDenominator();
	/**
	 * @return I_Integer getNumerator()。
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Integer p_getLeft() {
		return p_getNumerator();
	}
	/**
	 * @return I_Integer getDenominator()。
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
	 * 判断给定的字符串是否合法。
	 * <p>
	 * 合法的字符串可以产生一个有理数值。
	 * 
	 * @param value
	 *            给定的字符串。
	 * @return 真，如果合法；假，如果不合法。
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
	 * 根据给定的字符串，创建一个有理数值。
	 * 创建的有理数值可能为整数。
	 * <p>
	 * 这个字符串必须符合限定的语法：
	 * 它由四个可能的部分组成：
	 * 负号（可选，如果需要创建负数）、
	 * 分子整数、
	 * 除号（“/”）、
	 * 分母整数。
	 * 如果不符合语法则返回NuN。
	 * 
	 * @param value
	 *            给定的字符串。
	 * @return 产生的有理数值。
	 * @since 1
	 * @version 1
	 */
	static I_RationalNumber m_create(String value) {
		return null; // TODO unfinished.
	}
	/**
	 * 根据给定的符号和字符串，创建一个有理数值。
	 * 其中字符串部分代表有理数的绝对值。
	 * 创建的有理数值可能为整数。
	 * <p>
	 * 字符串必须符合限定的语法：
	 * 它由三个部分组成：
	 * 分子整数、
	 * 除号（“/”）、
	 * 分母整数。
	 * 如果不符合语法则返回NaN。
	 * <p>
	 * 如果符号是Neutral，则优先返回整数0。
	 * 
	 * @param sign
	 *            给定的符号。
	 * @param absvalue
	 *            给定的字符串，代表绝对值。
	 * @return 产生的有理数值。
	 * @since 1
	 * @version 1
	 */
	static I_RationalNumber m_create(Sign sign, String absvalue) {
		return null; // TODO unfinished.
	}
	/**
	 * 根据给定的符号和两个整数，创建一个有理数值。
	 * 有理数的定义即为两个整数的比值。
	 * <p>
	 * 如果符号为中性，则优先创建整数0。
	 * 如果分母为0，则优先创建NaN值。
	 * 
	 * @param sign
	 *            符号。
	 * @param numerator
	 *            分子整数。
	 * @param denominator
	 *            分母整数。
	 * @return 创建的有理数值。
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