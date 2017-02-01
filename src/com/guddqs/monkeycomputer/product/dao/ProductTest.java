package com.guddqs.monkeycomputer.product.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guddqs.monkeycomputer.product.entity.Packagedetail;
import com.guddqs.monkeycomputer.product.entity.Product;
import com.guddqs.monkeycomputer.product.entity.Productpackage;
import com.guddqs.monkeycomputer.product.entity.ProductpackageExample;
import com.guddqs.monkeycomputer.product.entity.Productttype;

public class ProductTest {

	@SuppressWarnings("resource")
	@Test
	public void testSave() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml");

		ProductttypeMapper type = (ProductttypeMapper) ctx.getBean("productttypeMapper");

		for (int i = 0; i < 5; i++) {

			Productttype record = new Productttype();
			record.setId(i + 1);
			record.setName("ProductType_" + (i + 1));
			type.insertSelective(record);

		}

	}

	@SuppressWarnings("resource")
	@Test
	public void testGet() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml", "applicationContext-mail.xml");

		ProductMapper productbiz = (ProductMapper) ctx.getBean(ProductMapper.class);

		Product product = productbiz.selectByPrimaryKey(2);

		System.out.println(product.getProducttype());

		System.out.println(product.getProductpackage());

		System.out.println(product.getProductpackage().getPackagedetails());

	}

	@SuppressWarnings("resource")
	@Test
	public void testSaveS() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml");

		ProductttypeMapper type = (ProductttypeMapper) ctx.getBean("productttypeMapper");

		for (int i = 5; i < 15; i++) {

			Productttype record = new Productttype();
			record.setId(i + 1);
			record.setName("ProductType_" + (i + 1));
			record.setParentid(i % 5 + 1);
			type.insertSelective(record);

		}

	}

	@SuppressWarnings("resource")
	@Test
	public void testGet1() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml", "applicationContext-mail.xml");

		ProductpackageMapper productbiz = ctx.getBean(ProductpackageMapper.class);

		ProductpackageExample example = new ProductpackageExample();
		example.createCriteria().andProductidEqualTo(1);

		Productpackage productpackage = productbiz.selectByExample(example).get(0);

		System.out.println(productpackage.getPackagedetails());

	}

	@SuppressWarnings("resource")
	@Test
	public void testGet2() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "springmvc.xml",
				"applicationContext-service.xml", "applicationContext-mail.xml");

		ProductMapper productbiz = (ProductMapper) ctx.getBean(ProductMapper.class);

		Product product = productbiz.selectByPrimaryKey(1);
		
		for(Packagedetail d:product.getProductpackage().getPackagedetails())
		{
			System.out.println(d);
		}

	}

}
