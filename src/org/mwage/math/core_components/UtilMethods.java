package org.mwage.math.core_components;
/**
 * 这个接口不代表任何概念，只是存放了一些工具方法供调用。
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface UtilMethods {
	default boolean p_containNaN(I_Value... values) {
		for(I_Value value : values) {
			if(value.p_isNaN()) {
				return true;
			}
		}
		return false;
	}
}