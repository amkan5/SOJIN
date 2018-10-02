package com.gms.web.tx;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gms.web.brd.Board;
import com.gms.web.brd.BoardMapper;
import com.gms.web.point.PointMapper;
@Service
// @Transactional //마크가 생기는건 대기상태 tx서비스가 걸리면 속도가 느려짐. 끝나기전까지 암것도실행xx
public class TxService {
	@Autowired BoardMapper brdMapper;
	@Autowired PointMapper poMapper;
	@Autowired Board brd;
	@Autowired HashMap<String, Object> map;
	@Transactional
	public Map<?,?> write(Map<?,?> p){
		map.clear();
		brdMapper.create(brd);
		poMapper.update(map);
		map.clear();
		return map;
	}
	
	@Transactional
	public Map<?,?> delete(Map<?,?> p){
		map.clear();
		brdMapper.delete(Integer.parseInt(p.get("bno").toString()));
		poMapper.update(map);
		map.clear();
		return map;
	}
}
