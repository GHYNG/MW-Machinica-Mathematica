package org.mwage.math.core_components;
import java.util.HashMap;
import org.mwage.math.core_components.logic.I_Boolean;
/**
 * 一些常用的值。这个类不参与任何运算，只是一个储存表。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public final class Util_CommonConstantValues {
	/**
	 * 无法处理的值。
	 * 
	 * @since 1
	 */
	public static final I_NaN NaN = I_NaN.NaN;
	/**
	 * 布尔值：真。
	 * 
	 * @since 1
	 */
	public static final I_Boolean TRUE = I_Boolean.TRUE;
	/**
	 * 布尔值：假。
	 * 
	 * @since 1
	 */
	public static final I_Boolean FALSE = I_Boolean.FALSE;
	/**
	 * 一个储存运算符的哈希表。
	 * 
	 * @since 1
	 */
	public static final HashMap<String, String> operators = new HashMap<String, String>();
	static {
		operators.put("add", "+");
		operators.put("sub", "-");
		operators.put("mut", "*");
		operators.put("div", "/");
		operators.put("equ", "=");
		operators.put("mor", ">");
		operators.put("les", "<");
	}
}