package org.mwage.math.core_components.util;
/**
 * 数组元素排序器，将元素从小打到排序。
 * 
 * @param <T>
 *            被处理的元素类型。
 * @author GHYNG
 * @since 1
 * @version 1
 * @author GHYNG
 */
public interface Λ_Sorter<T extends Object> {
	/**
	 * 从小到大排列数组中的元素。
	 * 
	 * @param array
	 *            可以排列的元素数组。
	 * @since 1
	 * @version 1
	 */
	void sort(Comparable<T>[] array);
}
class Tester {
	Λ_Sorter<?> inventorySorter = (Comparable<Object>[] array) -> {
		Comparable<Object> c = array[0];
		c.compareTo(c);
	};
}