package com.xzit.dao.position;

import java.util.List;

import com.xzit.vo.position.position;

public interface IPositionDao {
	public List<position> findAll();
	public void deletePosition(position position);
	public void updetePosition(position position);
	public void addPosition(position position);
	public position findbyId(position position);
	public position findbyName(position position);
	public position findbyType(position position);
	public int getPositionCount();
	public List<position> getAllByPage(int pageNo);

}
