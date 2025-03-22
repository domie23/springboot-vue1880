package com.dao;

import com.entity.YimiaoLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaoLiuyanView;

/**
 * 疫苗留言 Dao 接口
 *
 * @author 
 */
public interface YimiaoLiuyanDao extends BaseMapper<YimiaoLiuyanEntity> {

   List<YimiaoLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
