package com.gaokun.e3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaokun.e3.mapper.TbItemMapper;
import com.gaokun.e3.pojo.TbItem;
@Service("itemService")
public class ItemServiceImpl implements ItemService{
	private TbItemMapper itemMapper;
	@Autowired
	public void setItemMapper(TbItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}

	@Override
	public TbItem getItemById(Long itemId) {
		// TODO Auto-generated method stub
		return itemMapper.selectByPrimaryKey(itemId);
	}

}
