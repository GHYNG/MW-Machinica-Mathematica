package org.mwage.math.core_components.algebra.simple_operations;
import java.util.List;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
/**
 * ���ӱ��ʽ�����Ա���Ϊ����Ķ���ʽ��
 * <p>
 * ��һ���б��ɣ�����б��е�Ԫ�ش�����ʽ���ɼӺ����ӵ��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_MultiAdditionExpression extends I_AlgebraicExpression {
	/**
	 * ��ȡ����ʽ�еļӷ��
	 * 
	 * @return һ�����мӷ�����б�ĸ��ơ�������б���޸Ĳ���ı����������
	 * @since 1
	 * @version 1
	 */
	List<I_AlgebraicExpression> p_getAdders();
	/**
	 * ��ȡ����ʽ�еļ����
	 * 
	 * @return һ�����м�������б�ĸ��ơ�������б���޸Ĳ���ı����������
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