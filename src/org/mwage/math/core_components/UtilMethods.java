package org.mwage.math.core_components;
/**
 * ����ӿڲ������κθ��ֻ�Ǵ����һЩ���߷��������á�
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