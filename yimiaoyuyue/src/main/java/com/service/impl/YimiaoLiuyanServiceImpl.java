package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.YimiaoLiuyanDao;
import com.entity.YimiaoLiuyanEntity;
import com.service.YimiaoLiuyanService;
import com.entity.view.YimiaoLiuyanView;

/**
 * 疫苗留言 服务实现类
 */
@Service("yimiaoLiuyanService")
@Transactional
public class YimiaoLiuyanServiceImpl extends ServiceImpl<YimiaoLiuyanDao, YimiaoLiuyanEntity> implements YimiaoLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YimiaoLiuyanView> page =new Query<YimiaoLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
