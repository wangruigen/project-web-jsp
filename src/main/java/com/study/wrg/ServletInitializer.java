package com.study.wrg;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * war包项目需要继承SpringBootServletInitializer 且复写configure()方法
 * 并且 application.sources(ProjectWebJspApplication.class);
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProjectWebJspApplication.class);
	}

}
