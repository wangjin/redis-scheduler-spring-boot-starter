package com.github.wangjin252.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置类
 *
 * @author WangJin
 * @version 1.0
 * @date 2018-11-16 16:23
 */
@Getter
@Setter
@ConfigurationProperties(value = "redis.scheduler")
public class SchedulerProperties {

    private String redisHost;

}
