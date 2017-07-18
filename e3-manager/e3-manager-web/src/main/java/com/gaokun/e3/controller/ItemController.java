package com.gaokun.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaokun.e3.pojo.TbItem;
import com.gaokun.e3.service.ItemService;

@Controller("itemController")
public class ItemController {
	@Autowired
	private ItemService itemService ;

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		
		return itemService.getItemById(itemId);
	}
}
