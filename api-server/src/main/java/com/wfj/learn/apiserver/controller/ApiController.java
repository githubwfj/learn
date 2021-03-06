/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ApiController
 * Author:   mrwfj
 * Date:     2019/5/6 22:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wfj.learn.apiserver.controller;

import com.wfj.learn.apiserver.base.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mrwfj
 * @date 2019/5/6
 * @since 1.0.0
 */
@RestController
@EnableCaching
public class ApiController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/version")
    public Result Version() {
        logger.info("api.version={}", "V1.0");
        return Result.ok("V1.0");
    }


}
