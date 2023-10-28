package tech.amereta.lang.description.spring.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import tech.amereta.lang.description.spring.AbstractSpringModuleDescription;
import tech.amereta.lang.description.spring.security.type.SpringSecurityModuleJWTTypeDescription;

import java.lang.annotation.Annotation;

public final class SpringSecurityModuleDescription extends AbstractSpringModuleDescription {

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "authenticator",
            visible = true
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = SpringSecurityModuleJWTTypeDescription.class, name = "JWT"),
    })
    @Valid
    private AbstractSpringSecurityModuleTypeDescription security;

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootSecurityModuleGenerator.class;

    public AbstractSpringSecurityModuleTypeDescription getSecurity() {
        return security;
    }

    public void setSecurity(AbstractSpringSecurityModuleTypeDescription security) {
        this.security = security;
    }

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
