package tech.amereta.lang.description.spring.model;

import jakarta.validation.constraints.NotNull;
import tech.amereta.lang.description.spring.SpringModuleTypeDescription;
import tech.amereta.lang.description.spring.model.type.SpringModelType;

public abstract class AbstractSpringModelModuleTypeDescription implements SpringModuleTypeDescription {

    private SpringModelType type;

    @NotNull(message = "model's name must not be null!")
    private String name;

    public SpringModelType getType() {
        return type;
    }

    public void setType(SpringModelType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
