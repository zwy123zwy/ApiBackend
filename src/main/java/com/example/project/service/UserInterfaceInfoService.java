package com.example.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yuapicommon.model.entity.UserInterfaceInfo;


/**
* @author Zhangwenye
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-07-31 15:02:10
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
