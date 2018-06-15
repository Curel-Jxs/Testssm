package cn.hfnu.service;

import java.util.List;

import cn.hfnu.ssmtest.po.TbBook;
import cn.hfnu.ssmtest.po.TbUser;

public interface ServiceImp {
	/**
	 * 查询用户
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public List<TbUser> selectByAll(String loginname,String password) throws Exception;
	/**
	 * 查询所有图书
	 * @return
	 * @throws Exception
	 */
	public List<TbBook> selectAll()throws Exception;

}
