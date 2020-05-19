package org.mwage.math.core_components;
/**
 * 一个抽象的数学概念。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_MathObject extends UtilMethods {
	/**
	 * 这个数学部件被用于写入文件、储存、内部处理的字符串形式。
	 * 
	 * @return 本数学部件的字符串形式。
	 * @since 1
	 * @version 1
	 */
	String m_toFileString();
}