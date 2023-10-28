package tech.amereta.lang.description.spring.security.type;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface SpringBootJWTSecurityModuleGenerator {
}
