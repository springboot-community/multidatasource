package io.springboot.multidatasource.mapper1;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface Mapper1 {
	
	@Select("SELECT DATABASE();")
	@ResultType(String.class)
	String dataBaseName();
}
