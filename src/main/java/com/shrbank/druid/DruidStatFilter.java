package com.shrbank.druid;

/**
 * Created by woody on 2017/8/22.
 */
import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Druid的StatFilter
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/com.shrbank.druid/*")// 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {

}
