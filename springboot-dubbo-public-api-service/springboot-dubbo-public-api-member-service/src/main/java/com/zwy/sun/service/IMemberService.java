package com.zwy.sun.service;
/**
 * Copyright (C), 2015-2019, 北京掌沃云视媒文化传媒有限公司
 * FileName: IMemberService
 * Author:   SunSmile
 * Date:     2019/5/9 15:21
 * Description:
 */

public interface IMemberService {

    /**
     * 方法描述：获取会员名称
     * <br/>
     * <p>作者: SunSmile</p>
     * <p>日期: 2019/5/9 15:26</p>
     *       
      * @param username  
     * @return java.lang.String  
     */
    String getMember(String username);
}