package com.zwy.sun.impl.member;

import com.alibaba.dubbo.config.annotation.Service;
import com.zwy.sun.service.IMemberService;

/**
 * Copyright (C), 2015-2019, 北京掌沃云视媒文化传媒有限公司
 * FileName: MemberServiceImpl
 * Author:   SunSmile
 * Date:     2019/5/9 15:25
 * Description:实现类
 */
@Service
public class MemberServiceImpl implements IMemberService {

    @Override
    public String getMember(String username) {
        //业务处理
        return  "Dubbo：" + username;
    }
}