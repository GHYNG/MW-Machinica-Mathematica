package org.mwage.math.core_components.logic;
import org.mwage.math.core_components.I_Expression;
/**
 * 数学系统中的逻辑表达式。
 * 这种表达式又被视作为形式系统（Formal Language）中的判断性问题（Decision Problem），
 * 这类问题的回答是“是”或“否”。
 * 因此判断性问题可以视作是一种特殊的函数：
 * 它的输入是一种字符串（可以是代数式的等式，可以是其它判断性问题的判断），
 * 输出是布尔值（true/false）。
 * <p>
 * 注意！一个逻辑表达式存在两种意义：
 * 真值（判断计算后的结果）、
 * 含义（此表达式事实上的含义）。
 * 由于本程序高度依赖org.mwage.math.core_components.algebra代数包，
 * 而该代数包是基于皮亚诺公理系统的。
 * 因此在所有可能的合法字符串中（有无数个合法字符串），
 * 总存在某一个字符串：
 * 它的含义为真，但是不可被判断（被本程序计算）为真。这又被称作“不完备性”。
 * 任何与本程序采用相同原理的数学系统，
 * 只要内含皮亚诺公理系统，
 * 必然都是不完备的（哥德尔不完备定理）。
 * 
 * @see <a href="https://zh.wikipedia.org/wiki/%E4%B8%8D%E5%8F%AF%E5%88%A4%E5%AE%9A%E9%97%AE%E9%A2%98%E5%88%97%E8%A1%A8">不可判定问题列表</a>
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_LogicExpression extends I_Expression {
	/**
	 * 相等运算。应当具有交换性。
	 * 
	 * @param another
	 *            另一个逻辑表达式。
	 * @return 运算结果。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_equ(I_LogicExpression another);
	/**
	 * 与运算。应当具有交换性。
	 * 
	 * @param another
	 *            另一个逻辑表达式。
	 * @return 运算结果。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_and(I_LogicExpression another);
	/**
	 * 或运算。应当具有交换性。
	 * 
	 * @param another
	 *            另一个逻辑表达式。
	 * @return 运算结果。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_or(I_LogicExpression another);
	/**
	 * 非运算。
	 * 
	 * @return 运算结果。
	 * @since 1
	 * @version 1
	 */
	I_LogicExpression o_not();
	/**
	 * 判断此表达式的答案。相当于计算。
	 * 总存在无法判断的表达式。
	 * 
	 * @return 判断结果。
	 */
	I_Boolean o_decide();
}