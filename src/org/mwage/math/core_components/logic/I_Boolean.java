package org.mwage.math.core_components.logic;
import org.mwage.math.core_components.I_Expression;
import org.mwage.math.core_components.I_Value;
import static org.mwage.math.core_components.Util_CommonConstantValues.NaN;
/**
 * 数学逻辑系统中的布尔值。
 * <p>
 * 有两个可能的值：真、假，以及不存在（NaN）。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Boolean extends I_LogicExpression, I_Value {
	/**
	 * 布尔值：真。
	 * 
	 * @since 1
	 * @version 1
	 */
	I_Boolean TRUE = new C_Boolean(true);
	/**
	 * 布尔值：假。
	 * 
	 * @since 1
	 * @version 1
	 */
	I_Boolean FALSE = new C_Boolean(false);
	/**
	 * 与运算。
	 * 
	 * @param another
	 *            另一个布尔值。
	 * @return 运算结果，一个布尔值。
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_and(I_Boolean another) {
		if(p_containNaN(this, another)) {
			return NaN;
		}
		return (this == TRUE && another == TRUE) ? TRUE : FALSE;
	}
	/**
	 * 或运算。
	 * 
	 * @param another
	 *            另一个布尔值。
	 * @return 运算结果，一个布尔值。
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_or(I_Boolean another) {
		if(p_containNaN(this, another)) {
			return NaN;
		}
		return (this == TRUE || another == TRUE) ? TRUE : FALSE;
	}
	/**
	 * @return 运算结果，一个布尔值。
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Boolean o_not() {
		if(p_containNaN(this)) {
			return NaN;
		}
		return this == TRUE ? FALSE : TRUE;
	}
	/**
	 * 相等运算。
	 * 
	 * @param another
	 *            另一个布尔值。
	 * @return 真，如果与另一个布尔值相同；假，如果与另一个布尔值不相同；NaN，如果本值或另一个值是NaN。
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_equ(I_Boolean another) {
		if(p_containNaN(this, another)) {
			return NaN;
		}
		return this == another ? TRUE : FALSE;
	}
	/**
	 * 一个具体的布尔值无法进一步简化或计算。
	 * 
	 * @return 自身。
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Boolean p_calculate() {
		return this;
	}
	/**
	 * @return "true"，如果是真；"false"，如果是假；"NaN"，如果是NaN。
	 * @since 1
	 * @version 1
	 */
	@Override
	default String m_toFileString() {
		if(this == TRUE) {
			return "true";
		}
		if(this == FALSE) {
			return "false";
		}
		return "NaN";
	}
}
class C_Boolean implements I_Boolean {
	private final boolean me;
	C_Boolean(boolean me) {
		this.me = me;
	}
	@Override
	public I_LogicExpression o_equ(I_LogicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_LogicExpression o_and(I_LogicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_LogicExpression o_or(I_LogicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Boolean o_decide() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_LogicExpression o_equ(I_Expression another) {
		// TODO 自动生成的方法存根
		return null;
	}
}
class Util_Boolean {
	
}