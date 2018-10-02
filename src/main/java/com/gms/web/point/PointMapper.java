package com.gms.web.point;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.brd.Board;

@Repository
public interface PointMapper {
	 public void update(Map<?,?> p); //빈없이 
}
