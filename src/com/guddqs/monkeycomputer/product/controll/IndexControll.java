package com.guddqs.monkeycomputer.product.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guddqs.monkeycomputer.product.biz.PicProductBiz;
import com.guddqs.monkeycomputer.product.biz.ProductBiz;
import com.guddqs.monkeycomputer.product.entity.Picproduct;
import com.guddqs.monkeycomputer.product.entity.Product;
import com.guddqs.monkeycomputer.product.entity.ProductExample;

@Controller
public class IndexControll {

	@Autowired
	private ProductBiz productBiz;

	@Autowired
	private PicProductBiz picProductBiz;

	@RequestMapping("/index")
	public ModelAndView Index() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("faild");

		ProductExample example = new ProductExample();
		example.setOrderByClause("sales desc");

		List<Product> hotproducts = productBiz.selectByExample(example);
		for (int i = 0; i < hotproducts.size(); i++) {
			if (i > 8) {
				hotproducts.remove(i);
			}

		}

		List<Picproduct> piclist = picProductBiz.selectByExample(null);

		for (int i = 0; i < piclist.size(); i++) {
			// 控制图框显示商品不超过7个
			if (i > 7) {
				piclist.remove(i);
			}
		}


		if (hotproducts != null && hotproducts.size() > 0 && piclist!= null && piclist.size() > 0) {
			mv.addObject("piclist",piclist);
			mv.addObject("hotproducts",hotproducts);
			mv.setViewName("index");
		}

		return mv;
	}

}
