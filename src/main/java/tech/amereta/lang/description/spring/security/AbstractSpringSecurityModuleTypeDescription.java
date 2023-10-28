package tech.amereta.lang.description.spring.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import tech.amereta.lang.description.spring.SpringModuleTypeDescription;
import tech.amereta.lang.description.spring.security.type.SpringSecurityModuleType;

public abstract class AbstractSpringSecurityModuleTypeDescription implements SpringModuleTypeDescription {

    @JsonProperty("authenticator")
    private SpringSecurityModuleType type;

    private SpringSecurityEncoder encoder = SpringSecurityEncoder.BCRYPT;

    public SpringSecurityModuleType getType() {
        return type;
    }

    public void setType(SpringSecurityModuleType type) {
        this.type = type;
    }

    public SpringSecurityEncoder getEncoder() {
        return encoder;
    }

    public void setEncoder(SpringSecurityEncoder encoder) {
        this.encoder = encoder;
    }
}
