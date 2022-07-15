package com.example.demo.mapper;

import com.example.demo.entity.XieHouYuBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Created: by 2022-07-15 17:17
 * @Description: 歇后语数据访问层
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Mapper
public interface XieHouYuMapper {

    /**
     * 歇后语添加
     *
     * @param xieHouYuBeanList 歇后语实体集合
     * @return 添加结果
     */
    public int batchInsertXieHouYu(@Param("xieHouYuBeanList") List<XieHouYuBean> xieHouYuBeanList);

    /**
     * 歇后语谜底查询对应答案
     *
     * @param xhyRiddle 歇后语谜底
     * @return 谜底答案
     */
    public String selectXieHouYu(@Param("xhyRiddle") String xhyRiddle);
}
