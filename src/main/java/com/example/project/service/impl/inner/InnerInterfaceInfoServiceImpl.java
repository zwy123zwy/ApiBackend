package com.example.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.project.common.ErrorCode;
import com.example.project.exception.BusinessException;
import com.example.project.mapper.InterfaceInfoMapper;
import com.example.yuapicommon.model.entity.InterfaceInfo;
import com.example.yuapicommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部接口服务实现类
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }

    // [编程知识星球](https://yupi.icu) 连接万名编程爱好者，一起优秀！20000+ 小伙伴交流分享、100+ 各方向编程交流群、40+ 大厂嘉宾一对一答疑、4000+ 编程问答参考
}
