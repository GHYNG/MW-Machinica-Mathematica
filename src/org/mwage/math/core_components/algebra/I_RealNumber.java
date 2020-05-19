package org.mwage.math.core_components.algebra;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * 代数系统中的实数。
 * <p>
 * 实数可以看作是一条直线（数轴）上的点。 一个实数可能有多种表达方式：比如1和0.9小数循环是同一个值。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_RealNumber extends I_Number {
	/**
	 * 数的符号。可以是正、负、零。
	 * 
	 * @since 1
	 * @version 1
	 */
	public static enum Sign {
		/**
		 * 正值。
		 */
		POSITIVE,
		/**
		 * 负值。
		 */
		NEGATIVE,
		/**
		 * 零。
		 */
		NEUTRAL;
		/**
		 * 符号相乘。
		 * <p>
		 * 正正的正、负负得正、正负得负、负正得负、有零得零。
		 * 
		 * @param another
		 *            另一个符号。
		 * @return 相乘后得到的符号。
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
	 * 判断等于计算。
	 * 
	 * @param another
	 *            另一个实数。
	 * @return 真，如果本实数等于另一个实数；假，如果本实数不等于另一个实数；NaN，如果参与方存在NaN。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_equ(I_RealNumber another);
	/**
	 * 判断大于计算。
	 * <p>
	 * 由于实数在数轴上，所以可以比较大小。
	 * 
	 * @param another
	 *            另一个实数。
	 * @return 真，如果本实数大于另一个实数；假，如果本实数不大于另一个实数；NaN，如果参与方存在NaN。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_mor(I_RealNumber another);
	/**
	 * 判断小于计算。
	 * <p>
	 * 由于实数在数轴上，所以可以比较大小。
	 * 
	 * @param another
	 *            另一个实数。
	 * @return 真，如果本实数小于另一个实数；假，如果本实数不小于另一个实数；NaN，如果参与方存在NaN。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_les(I_RealNumber another);
	/**
	 * 加法运算。应当具有可交换性。
	 * <p>
	 * 两个实数相加，应当还是一个实数。
	 * 
	 * @param another
	 *            加数。
	 * @return 新的实数：本次加法的和。
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_add(I_RealNumber another);
	/**
	 * 减法运算。 两个实数相减，应当还是一个实数。
	 * 
	 * @param another
	 *            减数。
	 * @return 新的实数：本次减法的差。
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_sub(I_RealNumber another);
	/**
	 * 乘法运算。应当具有可交换性。 两个实数相乘，应当还是一个实数。
	 * 
	 * @param another
	 *            乘数。
	 * @return 新的实数：本次乘法的积。
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_mut(I_RealNumber another);
	/**
	 * 除法运算。 两个实数相除，应当还是一个实数。
	 * 
	 * @param another
	 *            除数。
	 * @return 新的实数：本次除法的商；NaN，如果除数是0.
	 * @since 1
	 * @version 1
	 */
	I_RealNumber o_div(I_RealNumber another);
	/**
	 * 加法逆元运算。又称作得到该实数的相反数。
	 * <p>
	 * 一个正数的相反数是一个符号相反、绝对值相同的负数；
	 * 一个负数的相反数是它的绝对值。
	 * 0的相反数是0。
	 * 每一个实数只对应唯一的相反数，
	 * 除了0以外所有实数是两两对应的相反数关系。
	 * 
	 * @return 该实数的相反数。
	 */
	I_RealNumber o_inv();
	/**
	 * 获取这个实数的正负性。
	 * 
	 * @return 这个实数的符号。
	 * @since 1
	 * @version 1
	 */
	Sign p_getSign();
	/**
	 * 获取近似数。可能会超出Java的double内存范围。
	 * 
	 * @param decimalPlaces
	 *            精确到小数位。
	 * @return 近似数。
	 * @since 1
	 * @version 1
	 */
	double m_round(int decimalPlaces);
}