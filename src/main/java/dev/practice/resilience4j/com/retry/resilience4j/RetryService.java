package dev.practice.resilience4j.com.retry.resilience4j;

import dev.practice.resilience4j.com.exception.RetryException;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RetryService {

    private static final String SIMPLE_RETRY_CONFIG = "simpleRetryConfig";

    // simpleRetryConfig 는 application.yaml 에 설정되어 있다.
    @Retry(name = SIMPLE_RETRY_CONFIG, fallbackMethod = "fallback")
    public String process(String param) {
        return callAnotherServer(param);
    }

    private String fallback(String param, Exception ex) {
        // retry에 전부 실패해야 fallback이 실행
        log.info("fallback! your request is " + param);
        return "Recovered: " + ex.toString();
    }

    private String callAnotherServer(String param) {
        // retry exception은 retry된다.
        throw new RetryException("retry exception");
        // ignore exception은 retry하지 않고 바로 예외가 클라이언트에게 전달된다.
//        throw new IgnoreException("ignore exception");
    }

}