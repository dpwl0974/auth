package com.rest1.global.rq;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope // 요청마다 생성 후 사라짐 -> 즉, 매번 달라짐
public class Rq {

}
