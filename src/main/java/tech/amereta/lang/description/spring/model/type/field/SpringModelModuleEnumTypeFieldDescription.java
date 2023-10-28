package tech.amereta.lang.description.spring.model.type.field;

import jakarta.validation.constraints.NotNull;

public final class SpringModelModuleEnumTypeFieldDescription {

    @NotNull(message = "enum field's name must not be null!")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
