package io.springboot.multidatasource.mapper2;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface Mapper2 {
	
	@Select("SELECT DATABASE();")
	@ResultType(String.class)
	String dataBaseName();
}
