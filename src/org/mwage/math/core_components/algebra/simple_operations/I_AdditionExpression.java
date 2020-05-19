package org.mwage.math.core_components.algebra.simple_operations;
import java.util.ArrayList;
import java.util.List;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperation;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperator;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * 加法表达式。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_AdditionExpression extends I_AlgebraicBinaryOperation, I_MultiAdditionExpression {
	/**
	 * @return 加法运算符。
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_AlgebraicBinaryOperator p_getOperator() {
		return I_AlgebraicBinaryOperator.adder;
	}
	/**
	 * @since 1
	 * @version 1
	 */
	@Override
	default List<I_AlgebraicExpression> p_getAdders() {
		List<I_AlgebraicExpression> list = new ArrayList<I_AlgebraicExpression>();
		list.add(p_getLeft());
		list.add(p_getRight());
		return list;
	}
	/**
	 * @return 一个空的减法项列表，因为加法表达式中不存在减法项。
	 * @since 1
	 * @version 1
	 */
	@Override
	default List<I_AlgebraicExpression> p_getSubers() {
		return new ArrayList<I_AlgebraicExpression>();
	}
	@Override
	default String m_toFileString() {
		// TODO 自动生成的方法存根
		return I_AlgebraicBinaryOperation.super.m_toFileString();
	}
	/**
	 * 判断给定的字符串是否合法。
	 * 
	 * @param value
	 *            给定的字符串。
	 * @return 真，如果合法；假，如果不合法。
	 */
	static boolean m_legal(String value) {
		return false;
		// TODO unfinished
	}
	/**
	 * 根据给定的字符串，创建一个新的加法式。
	 * 
	 * @param value
	 *            给定的字符串。
	 * @return NaN，如果字符串不合法；一个新的加法式，如果字符串合法。
	 * @since 1
	 * @version 1
	 */
	static I_AdditionExpression m_create(String value) {
		return null;
	}
	/**
	 * 根据给定的部件，创建一个新的加法式。
	 * 
	 * @param left
	 *            运算符左边的代数表达式。
	 * @param right
	 *            运算符右边的代数表达式。
	 * @return NaN，如果左边或右边存在NaN；一个新的加法表达式。
	 * @since 1
	 * @version 1
	 */
	static I_AdditionExpression m_create(I_AlgebraicExpression left, I_AlgebraicExpression right) {
		return null;
	}
}