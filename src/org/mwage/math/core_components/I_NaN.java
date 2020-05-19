package org.mwage.math.core_components;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperator;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
import org.mwage.math.core_components.algebra.I_Integer;
import org.mwage.math.core_components.algebra.I_RationalNumber;
import org.mwage.math.core_components.algebra.I_RealNumber;
import org.mwage.math.core_components.logic.I_Boolean;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * 不存在值是一种特殊的值。它和任何其他值一起运算都会得到自身。
 * <p>
 * NaN具有传染性：任何运算中如果有参数为NaN，返回结果必须也为NaN。
 * <p>
 * NaN是各种语法合法但操作非法的操作返回，比如以下操作：{@code a/0}，其中{@code 0}为某个数。
 * <p>
 * 尽管NaN值被视作是各种数值类型的成员，但它并不应该被视作是这些类型其它成员的同类，比如：
 * NaN值被视作是一种I_Integer类型的，但NaN并不在数轴的任何位置上。
 * 因此可以将NaN视作是各种值得占位符。
 * <p>
 * NaN的文件字符串为“NaN”，
 * 而原则上，任何“NaN”字符串将被解读为NaN值。
 * 注意：NaN值是无法创建的，
 * 因为在接口内已经提供了一个NaN实例，
 * 而这个实例将是全程序内唯一一个NaN实例。
 * 尽管如此，还是提供了一个{@code m_create(string)}方法以获得实例，
 * 这个方法将返回接口中这个已有的实例。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_NaN extends I_Value, I_Integer, I_Boolean {
	/**
	 * 不存在值本身。
	 * 
	 * @since 1
	 * @version 1
	 */
	I_NaN NaN = new C_NaN();
	/**
	 * @return NaN。
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_NaN o_equ(I_Expression another) {
		return NaN;
	}
	/**
	 * @return 字符串"NaN"。
	 */
	@Override
	default String m_toFileString() {
		return "NaN";
	}
	/**
	 * 不存在值无法进一步简化。
	 * 
	 * @return 自身。
	 */
	@Override
	I_NaN p_calculate();
	/**
	 * @return true。
	 * @since 1
	 * @version 1
	 */
	@Override
	default boolean p_isNaN() {
		return true;
	}
}
class C_NaN implements I_NaN {
	@Override
	public String toString() {
		return "NaN";
	}
	@Override
	public I_Integer o_add(I_Integer another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer o_sub(I_Integer another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer o_mut(I_Integer another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RationalNumber o_div(I_Integer another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RationalNumber o_add(I_RationalNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RationalNumber o_sub(I_RationalNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RationalNumber o_mut(I_RationalNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RationalNumber o_div(I_RationalNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer p_getNumerator() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Integer p_getDenominator() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RealNumber o_add(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RealNumber o_sub(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RealNumber o_mut(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_RealNumber o_div(I_RealNumber another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public double m_round(int decimalPlaces) {
		// TODO 自动生成的方法存根
		return 0;
	}
	@Override
	public Sign p_getSign() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_AlgebraicExpression o_add(I_AlgebraicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_AlgebraicExpression o_sub(I_AlgebraicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_AlgebraicExpression o_mut(I_AlgebraicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_AlgebraicExpression o_div(I_AlgebraicExpression another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_NaN p_calculate() {
		return this;
	}
	@Override
	public String p_getAbsString() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_NaN o_inv() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Boolean o_or(I_Boolean another) {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_Boolean o_not() {
		// TODO 自动生成的方法存根
		return null;
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
	public I_AlgebraicBinaryOperator p_getOperator() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_NaN p_getLeft() {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public I_NaN p_getRight() {
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