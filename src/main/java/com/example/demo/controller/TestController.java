package com.example.demo.controller;

import cn.hutool.json.JSONUtil;
import com.example.demo.entity.DmDimension;
import com.example.demo.entity.MdCodeValue;
import com.example.demo.entity.MdCodeValueMapping;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Created: by 2022-07-14 17:32
 * @Description: 前端AJAX数据请求控制器+JSON数据返回
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@RestController
public class TestController {

    /**
     * 前端表单提交传递的数据实体
     * 单个实体+数组多个实体+单个属性
     */
    @PostMapping(value = "/test/formdata", produces = "application/json;charset=UTF-8")
    public String testFormData(@RequestPart DmDimension dmDimension, @RequestPart MdCodeValueMapping mapping, @RequestPart List<MdCodeValue> mdCodeValueList, @RequestParam Boolean isMapping) {
        System.out.println("dmDimension===" + dmDimension);
        System.out.println("mdCodeValueList===" + mdCodeValueList);
        System.out.println("mapping===" + mapping);
        System.out.println("isMapping===" + isMapping);
        return JSONUtil.toJsonStr(new HashMap<String, Object>(){{
            put("dmDimension", dmDimension);
            put("mapping", mapping);
            put("mdCodeValueList", mdCodeValueList.get(0));
            put("isMapping", isMapping);
        }});
    }

    /**
     * @param map 前端传递的数据
     */
    @PostMapping(value = "/test/mapdata")
    public void testMapData(@RequestBody Map<String, Object> map) {
        System.out.println("map" + JSONUtil.toJsonStr(map));
    }

    /**
     * 返回JSON数据到前端
     *
     * @param map 前端传递的数据
     * @return JSON数据
     */
    @PostMapping(value = "/test/dhdata")
    public Map testDhData(@RequestBody Map<String, Object> map) {
        System.out.println("dmDimension===" + JSONUtil.toJsonStr(map.get("dmDimension")));
        System.out.println("mappingMap===" + JSONUtil.toJsonStr(map.get("mappingMap")));
        System.out.println("mdCodeValueList===" + JSONUtil.toJsonStr(map.get("mdCodeValueList")));
        Map result = new HashMap();
        result.put("message", "success");
        return result;
    }
}
