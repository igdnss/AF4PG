package com.channing.af.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author ：channing
 * @date ：Created in 5/9/2020 4:58 PM
 * @description：${description}
 */
@Slf4j
@Component
public class Af4pgMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start auto fill ....");
        this.setFieldValByName("createdTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("createdBy", "gbms", metaObject);
        this.setFieldValByName("modifiedTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("modifiedBy", "gbms", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start auto update ....");
        this.setFieldValByName("modifiedTime", LocalDateTime.now(), metaObject);
    }
}
