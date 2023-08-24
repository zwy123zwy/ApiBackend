package com.example.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yuapicommon.model.entity.InterfaceInfo;



/**
* @author Zhangwenye
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-07-30 15:52:48
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
