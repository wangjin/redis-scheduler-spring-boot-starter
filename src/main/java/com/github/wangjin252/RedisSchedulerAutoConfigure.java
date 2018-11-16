package com.github.wangjin252;

import com.github.wangjin252.properties.SchedulerProperties;
import com.github.wangjin252.scheduler.RedisScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangJin
 * @version 1.0
 * @date 2018-11-16 16:21
 */
@Configuration
@ConditionalOnClass(RedisScheduler.class)
@EnableConfigurationProperties({SchedulerProperties.class})
public class RedisSchedulerAutoConfigure {

    @Autowired
    private SchedulerProperties schedulerProperties;

    @Bean(name = "taskScheduler")
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "redis.scheduler", value = "enabled", havingValue = "true")
    RedisScheduler taskScheduler() {


        return null;
    }
}
