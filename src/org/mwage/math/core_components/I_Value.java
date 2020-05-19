package org.mwage.math.core_components;
import static org.mwage.math.core_components.Util_CommonConstantValues.NaN;
/**
 * ��ѧϵͳ�еĸ���ֵ��
 * ��ЩֵӦ���������ǳ����������Ǳ�����
 * �������Ӧ�ÿ���ֱ�Ӳ������㣬
 * �õ�����һЩȷ�е�ֵ��
 * �����ǰ��������ı��ʽ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Value extends I_Expression {
	/**
	 * �жϱ�ֵ�Ƿ���NaNֵ��
	 * �൱��{@code this == NaN}��
	 * <p>
	 * ���������Ӧ�ñ����ء�
	 * 
	 * @return �棬����ǣ��٣�������ǣ�
	 * @since 1
	 * @version 1
	 */
	default boolean p_isNaN() {
		return this == NaN;
	}
}