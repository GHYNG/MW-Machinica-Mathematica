package org.mwage.math.core_components;
/**
 * ��ѧϵͳ�еĹؼ��֡�
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public enum E_Keyword {
	/**
	 * �档
	 * 
	 * @since 1
	 */
	TRUE("true"),
	/**
	 * �١�
	 * 
	 * @since 1
	 */
	FALSE("false"),
	/**
	 * �롣
	 * 
	 * @since 1
	 */
	AND("and"),
	/**
	 * ��
	 * 
	 * @since 1
	 */
	OR("or"),
	/**
	 * �ǡ�
	 * 
	 * @since 1
	 */
	NOT("not"),
	/**
	 * ��
	 * 
	 * @since 1
	 */
	NULL("null"),
	/**
	 * �Ƿ���ֵ��
	 * 
	 * @since 1
	 */
	NaN("NaN");
	private final String fileString;
	E_Keyword(String fileString) {
		this.fileString = fileString;
	}
	/**
	 * ��Щ�ؼ��ֱ�д���ļ�����ʽ��
	 * 
	 * @return �ؼ��ֵ��ַ�����
	 */
	public String m_toFileString() {
		return fileString;
	}
}