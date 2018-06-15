package cn.hfnu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.*;
import cn.hfnu.ssmtest.mapper.TbBookMapper;
import cn.hfnu.ssmtest.mapper.TbUserMapper;
import cn.hfnu.ssmtest.po.TbBook;
import cn.hfnu.ssmtest.po.TbBookExample;
import cn.hfnu.ssmtest.po.TbUser;
import cn.hfnu.ssmtest.po.TbUserExample;

@Service
public class MyService implements ServiceImp{
	@Autowired
	private TbUserMapper tbUserMapper;
	@Autowired
	private TbBookMapper tbBookMapper;
	@Override
	public List<TbUser> selectByAll(String loginname, String password) throws Exception {
		TbUserExample TbUserExample=new TbUserExample();
		TbUserExample.Criteria criteria=TbUserExample.createCriteria();
		criteria.andLoginnameEqualTo(loginname);
		criteria.andPasswordEqualTo(password);
		List<TbUser> user_list=tbUserMapper.selectByExample(TbUserExample);		
		return user_list;
	}

	@Override
	public List<TbBook> selectAll() throws Exception {
		TbBookExample tbBookExample=new TbBookExample();
		List<TbBook>book_list=tbBookMapper.selectByExample(tbBookExample);
		return book_list;
	}

}
