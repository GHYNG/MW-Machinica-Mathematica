package org.mwage.math.core_components;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * 数学表达式。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Expression extends I_MathObject {
	/**
	 * 相等运算。应当具有交换性。
	 * <p>
	 * 判断此表达式是否与给定表达式相等
	 * 
	 * @param another
	 *            另一个给定的表达式。
	 * @return 一个逻辑表达式。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_equ(I_Expression another);
	/**
	 * 计算此表达式。结果可能不变，可能得到一个新的表达式，可能得到一个具体的值。
	 * <p>
	 * 计算相当于将某一个表达式简化到无法简化的程度。
	 * 
	 * @return 计算后的结果。
	 * @since 1
	 * @version 1
	 */
	I_Expression p_calculate();
	/**
	 * 这个数学表达式被用于写入文件、储存、内部处理的字符串形式。
	 * <p>
	 * 这个方法应该具有双向唯一性，即：
	 * 一个表达式只会对应唯一的字符串，一个字符串也只会对应唯一的表达式。
	 * 
	 * @return 本表达式的字符串形式。
	 * @since 1
	 * @version 1
	 */
	@Override
	String m_toFileString();
}