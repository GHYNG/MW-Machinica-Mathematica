package org.mwage.math.core_components.util;
/**
 * ����Ԫ������������Ԫ�ش�С������
 * 
 * @param <T>
 *            �������Ԫ�����͡�
 * @author GHYNG
 * @since 1
 * @version 1
 * @author GHYNG
 */
public interface ��_Sorter<T extends Object> {
	/**
	 * ��С�������������е�Ԫ�ء�
	 * 
	 * @param array
	 *            �������е�Ԫ�����顣
	 * @since 1
	 * @version 1
	 */
	void sort(Comparable<T>[] array);
}
class Tester {
	��_Sorter<?> inventorySorter = (Comparable<Object>[] array) -> {
		Comparable<Object> c = array[0];
		c.compareTo(c);
	};
}