package org.mwage.math.core_components;
/**
 * ���ڸ��������ö�٣���Ҫ��Ϊ�˴������ǵ��ַ�����̬��
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public enum E_Operator {
	/**
	 * �ӷ���
	 * 
	 * @since 1
	 * @version 1
	 */
	ADD("+"),
	/**
	 * ������
	 * 
	 * @since 1
	 * @version 1
	 */
	SUB("-"),
	/**
	 * �˷���
	 * 
	 * @since 1
	 * @version 1
	 */
	MUT("*"),
	/**
	 * ������
	 * 
	 * @since 1
	 * @version 1
	 */
	DIV("/"),
	/**
	 * ���ڡ�
	 * 
	 * @since 1
	 * @version 1
	 */
	EQU("="),
	/**
	 * ���ڡ�
	 * 
	 * @since 1
	 * @version 1
	 */
	MOR(">"),
	/**
	 * С�ڡ�
	 * 
	 * @since 1
	 * @version 1
	 */
	LES("<"),
	/**
	 * �롣
	 * 
	 * @since 1
	 * @version 1
	 */
	AND("AND"),
	/**
	 * ��
	 * 
	 * @since 1
	 * @version 1
	 */
	OR("OR"),
	/**
	 * �ǡ�
	 * 
	 * @since 1
	 * @version 1
	 */
	NOT("NOT");
	private final String fileString;
	E_Operator(String fileString) {
		this.fileString = fileString;
	}
	/**
	 * �������������ַ�����̬��
	 * ��Щ�ַ�������д���ļ���
	 * 
	 * @return ��������ַ�����̬��
	 */
	public String m_toFileString() {
		return fileString;
	}
}