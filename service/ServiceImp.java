package cn.hfnu.service;

import java.util.List;

import cn.hfnu.ssmtest.po.TbBook;
import cn.hfnu.ssmtest.po.TbUser;

public interface ServiceImp {
	/**
	 * ��ѯ�û�
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public List<TbUser> selectByAll(String loginname,String password) throws Exception;
	/**
	 * ��ѯ����ͼ��
	 * @return
	 * @throws Exception
	 */
	public List<TbBook> selectAll()throws Exception;

}
