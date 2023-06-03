package com.manage.community.dao;
import com.manage.community.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;



@Repository

public interface CommunityMapper extends Mapper<Community> {
}
