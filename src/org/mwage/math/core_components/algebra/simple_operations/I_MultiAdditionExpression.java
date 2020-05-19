package org.mwage.math.core_components.algebra.simple_operations;
import java.util.List;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * 连加表达式，可以被视为广义的多项式。
 * <p>
 * 由一个列表构成，这个列表中的元素代表表达式中由加号连接的项。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_MultiAdditionExpression extends I_AlgebraicExpression {
	/**
	 * 获取多项式中的加法项。
	 * 
	 * @return 一个含有加法项的列表的复制。对这个列表的修改不会改变这个对象本身。
	 * @since 1
	 * @version 1
	 */
	List<I_AlgebraicExpression> p_getAdders();
	/**
	 * 获取多项式中的减法项。
	 * 
	 * @return 一个含有减法项的列表的复制。对这个列表的修改不会改变这个对象本身。
	 * @since 1
	 * @version 1
	 */
	List<I_AlgebraicExpression> p_getSubers();
	@Override
	default String m_toFileString() {
		List<I_AlgebraicExpression> adders = p_getAdders(), subers = p_getSubers();
		String string = "";
		for(I_AlgebraicExpression adder : adders) {
		}
		// TODO unfinished.
		return "";
	}
}