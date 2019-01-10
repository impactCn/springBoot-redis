package com.dome.config;

import com.dome.util.RedisUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2019/1/9.
 */

@Configuration
@Import({CacheConfig.class, RedisUtil.class})
public class CacheAutoConfig {
}
