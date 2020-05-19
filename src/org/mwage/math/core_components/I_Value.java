package org.mwage.math.core_components;
import static org.mwage.math.core_components.Util_CommonConstantValues.NaN;
/**
 * 数学系统中的各种值。
 * 这些值应当被视作是常量，而不是变量。
 * 因此它们应该可以直接参与运算，
 * 得到另外一些确切的值，
 * 而不是包含变量的表达式。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Value extends I_Expression {
	/**
	 * 判断本值是否是NaN值。
	 * 相当于{@code this == NaN}。
	 * <p>
	 * 这个函数不应该被重载。
	 * 
	 * @return 真，如果是；假，如果不是；
	 * @since 1
	 * @version 1
	 */
	default boolean p_isNaN() {
		return this == NaN;
	}
}