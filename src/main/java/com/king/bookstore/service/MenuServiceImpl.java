package com.king.bookstore.service;

import com.king.bookstore.common.inteface.mapper.IMenuMapper;
import com.king.bookstore.common.inteface.service.IMenuService;
import com.king.bookstore.common.pojo.Menu;
import com.king.bookstore.common.pojo.MenuExample;
import com.king.bookstore.common.pojo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements IMenuService {
	
	@Autowired
	private IMenuMapper menuMapper;

	@Override
	public int countByExample(MenuExample example) {
		return menuMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MenuExample example) {
		return menuMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return menuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Menu record) {
		return menuMapper.insert(record);
	}

	@Override
	public int insertSelective(Menu record) {
		return menuMapper.insertSelective(record);
	}

	@Override
	public List<Menu> selectByExample(MenuExample example) {
		return menuMapper.selectByExample(example);
	}

	@Override
	public Menu selectByPrimaryKey(Long id) {
		return menuMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Menu record, MenuExample example) {
		return menuMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Menu record, MenuExample example) {
		return menuMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		return menuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		return menuMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Tree> selectTreeNodes(Long id) {
		return menuMapper.selectTreeNodes(id);
	}

	@Override
	public List<Tree> selectTreeNodes1(Long id, String parentMenu) {
		return menuMapper.selectTreeNodes1(id,parentMenu);
	}

	@Override
	public Map<String, Object> selectParentMenuInfoById(Long id) {
		return menuMapper.selectParentMenuInfoById(id);
	}
}
