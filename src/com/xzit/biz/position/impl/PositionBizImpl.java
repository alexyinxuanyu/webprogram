package com.xzit.biz.position.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xzit.biz.position.IPositionBiz;
import com.xzit.dao.position.IPositionDao;
import com.xzit.dao.position.impl.PositionDaoImpl;
import com.xzit.vo.position.position;

public class PositionBizImpl implements IPositionBiz {

	IPositionDao positiondao = new PositionDaoImpl();
	List<position> positionList = null;
	
	public int getPositionCount() {
		return positiondao.getPositionCount();
	}
	public List<position> findAll() {
		return positiondao.findAll();
	}
	public void deletePosition(position position) {
		positiondao.deletePosition(position);
	}
	public void updetePosition(position position) {
		positiondao.updetePosition(position);
	}
	public void addPosition(position position) {
		positiondao.addPosition(position);
	}
	public position findbyId(position position) {
		return positiondao.findbyId(position);
	}
	public position findbyName(position position) {
		return positiondao.findbyName(position);
	}
	public position findbyType(position position) {
		return positiondao.findbyType(position);
	}
	public List<position> getAllByPage(int pageNo) {
		return positiondao.getAllByPage(pageNo);
	}
	public int size() {
		return positionList.size();
	}
	public boolean isEmpty() {
		return positionList.isEmpty();
	}
	public boolean contains(Object o) {
		return positionList.contains(o);
	}
	public Iterator<position> iterator() {
		return positionList.iterator();
	}
	public Object[] toArray() {
		return positionList.toArray();
	}
	public <T> T[] toArray(T[] a) {
		return positionList.toArray(a);
	}
	public boolean add(position e) {
		return positionList.add(e);
	}
	public boolean remove(Object o) {
		return positionList.remove(o);
	}
	public boolean containsAll(Collection<?> c) {
		return positionList.containsAll(c);
	}
	public boolean addAll(Collection<? extends position> c) {
		return positionList.addAll(c);
	}
	public boolean addAll(int index, Collection<? extends position> c) {
		return positionList.addAll(index, c);
	}
	public boolean removeAll(Collection<?> c) {
		return positionList.removeAll(c);
	}
	public boolean retainAll(Collection<?> c) {
		return positionList.retainAll(c);
	}
	public void clear() {
		positionList.clear();
	}
	public boolean equals(Object o) {
		return positionList.equals(o);
	}
	public int hashCode() {
		return positionList.hashCode();
	}
	public position get(int index) {
		return positionList.get(index);
	}
	public position set(int index, position element) {
		return positionList.set(index, element);
	}
	public void add(int index, position element) {
		positionList.add(index, element);
	}
	public position remove(int index) {
		return positionList.remove(index);
	}
	public int indexOf(Object o) {
		return positionList.indexOf(o);
	}
	public int lastIndexOf(Object o) {
		return positionList.lastIndexOf(o);
	}
	public ListIterator<position> listIterator() {
		return positionList.listIterator();
	}
	public ListIterator<position> listIterator(int index) {
		return positionList.listIterator(index);
	}
	public List<position> subList(int fromIndex, int toIndex) {
		return positionList.subList(fromIndex, toIndex);
	}
	
}
