package tech.amereta.lang.description.spring.security.type;


import com.fasterxml.jackson.annotation.JsonIgnore;
import tech.amereta.lang.description.spring.security.AbstractSpringSecurityModuleTypeDescription;

import java.lang.annotation.Annotation;

public class SpringSecurityModuleJWTTypeDescription extends AbstractSpringSecurityModuleTypeDescription {

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootJWTSecurityModuleGenerator.class;

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
