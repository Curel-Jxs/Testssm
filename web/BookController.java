package cn.hfnu.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cn.hfnu.service.MyService;
import cn.hfnu.ssmtest.po.TbBook;
import cn.hfnu.ssmtest.po.TbUser;

@Controller
public class BookController {
	@Autowired
	private MyService service;
	@RequestMapping(value="/login")
	public ModelAndView queryUser(@RequestParam String loginname,@RequestParam String password) throws Exception{
		List<TbUser> user_list=service.selectByAll(loginname, password);
		ModelAndView modelAndView=new ModelAndView();
	if(user_list.size()>0){
		List<TbBook>book_list=service.selectAll();
		modelAndView.addObject("book_list", book_list);
		modelAndView.setViewName("book");
		
	}
	return modelAndView;
}

}