package org.mwage.math.core_components.backup;
import static org.mwage.math.core_components.Util_CommonConstantValues.NaN;
import org.mwage.math.core_components.I_Expression;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperator;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
import org.mwage.math.core_components.algebra.I_Integer;
import org.mwage.math.core_components.algebra.I_RationalNumber;
import org.mwage.math.core_components.algebra.I_RealNumber;
import org.mwage.math.core_components.algebra.I_RealNumber.Sign;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * 数学代数系统中的零（0）。0是唯一既不是正数也不是负数的整数。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Zero extends I_Integer {
	/**
	 * 0。世界上只有一个0。
	 * 
	 * @since 1
	 */
	I_Zero ZERO = new C_Zero();
}
class C_Zero implements I_Zero {
	@Override
	public I_Integer o_add(I_Integer another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return another;
	}
	@Override
	public I_Integer o_sub(I_Integer another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer o_mut(I_Integer another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public I_RationalNumber o_div(I_Integer another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		if(another == ZERO) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public I_RationalNumber o_add(I_RationalNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return another;
	}
	@Override
	public I_RationalNumber o_sub(I_RationalNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RationalNumber o_mut(I_RationalNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public I_RationalNumber o_div(I_RationalNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		if(another == ZERO) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public I_Integer p_getNumerator() {
		return ZERO;
	}
	@Override
	public I_Integer p_getDenominator() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RealNumber o_add(I_RealNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return another;
	}
	@Override
	public I_RealNumber o_sub(I_RealNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RealNumber o_mut(I_RealNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public I_RealNumber o_div(I_RealNumber another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		if(another == ZERO) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public double m_round(int decimalPlaces) {
		return 0;
	}
	@Override
	public Sign p_getSign() {
		return Sign.NEUTRAL;
	}
	@Override
	public I_AlgebraicExpression o_add(I_AlgebraicExpression another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return another;
	}
	@Override
	public I_AlgebraicExpression o_sub(I_AlgebraicExpression another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_AlgebraicExpression o_mut(I_AlgebraicExpression another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public I_AlgebraicExpression o_div(I_AlgebraicExpression another) {
		I_Expression e = another.p_calculate();
		if(e == NaN) {
			return NaN;
		}
		if(another == ZERO) {
			return NaN;
		}
		return ZERO;
	}
	@Override
	public String toString() {
		return "0";
	}
	@Override
	public I_Integer p_calculate() {
		return this;
	}
	@Override
	public String p_getAbsString() {
		return "0";
	}
	@Override
	public I_Integer o_inv() {
		return this;
	}
	@Override
	public I_LogicExpression o_equ(I_Expression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_AlgebraicBinaryOperator p_getOperator() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer p_getLeft() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer p_getRight() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public String m_toFileString() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_LogicExpression o_equ(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_LogicExpression o_mor(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_LogicExpression o_les(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
}