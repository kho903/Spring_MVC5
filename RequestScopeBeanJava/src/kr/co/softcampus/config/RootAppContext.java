package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import kr.co.softcampus.beans.DataBean1;

// 프로젝트 작업 시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {

	@Bean
	@RequestScope
	public DataBean1 dataBean1() {
		return new DataBean1();
	}
}
