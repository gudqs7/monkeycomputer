package com.guddqs.monkeycomputer.product.controll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.product.biz.ProductBiz;
import com.guddqs.monkeycomputer.product.biz.ProductTypeBiz;
import com.guddqs.monkeycomputer.product.entity.Product;
import com.guddqs.monkeycomputer.product.entity.ProductExample;
import com.guddqs.monkeycomputer.product.entity.Productttype;
import com.guddqs.monkeycomputer.product.entity.ProductttypeExample;

@Controller
public class ProductControll {

	@Autowired
	private ProductBiz productBiz;
	
	@Autowired
	private ProductTypeBiz typeBiz;
	
	@RequestMapping("/search")
	public ModelAndView doListProduct(Integer tpid,Integer tid){
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("faild");

		List<Product> plist=null;
		
		if(tpid!=null){
			ProductttypeExample typeexample=new ProductttypeExample();
			typeexample.createCriteria().andParentidEqualTo(tpid);
			List<Productttype> typelist=typeBiz.selectByExample(typeexample);
			
			
			List<Integer> tids=new ArrayList<Integer>();

			for(Productttype t:typelist){
				tids.add(t.getId());
			}
			
			ProductExample example=new ProductExample();
			example.createCriteria().andTypeidIn(tids);
			
			plist=productBiz.selectByExample(example);
		}else if(tid!=null){
			ProductExample example=new ProductExample();
			example.createCriteria().andTypeidEqualTo(tid);
			plist=productBiz.selectByExample(example);
		}
		
		if(plist!=null){
			
			mv.addObject("plist",plist);
			mv.setViewName("product/listproduct");
			
		}
		
		return mv;
	}
	
	@RequestMapping("/viewproduct")
	public ModelAndView doViewProduct(Integer id){
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("faild");

		Product product=productBiz.selectByPrimaryKey(id);
		if(product!=null&&product.getId()!=null){
			mv.addObject("product",product);
			mv.setViewName("product/viewproduct");
		}
		
		return mv;
	}
	
	
}
