package com.manage.community.dao;

import com.manage.community.domain.Building;
import com.manage.community.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface BuildingMapper extends Mapper<Building> {
}
