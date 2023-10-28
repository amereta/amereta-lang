package tech.amereta.lang.description.spring;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.annotation.Annotation;

public abstract class AbstractSpringModuleDescription {

    @JsonProperty("module")
    private SpringModuleType type;

    public abstract Class<? extends Annotation> getGenerator();

    public SpringModuleType getType() {
        return type;
    }

    public void setType(SpringModuleType type) {
        this.type = type;
    }
}
