package tech.amereta.lang.description.spring.model.type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tech.amereta.lang.description.spring.model.AbstractSpringModelModuleTypeDescription;
import tech.amereta.lang.description.spring.model.type.field.SpringModelModuleEnumTypeFieldDescription;

import java.lang.annotation.Annotation;
import java.util.List;

public final class SpringModelModuleEnumTypeDescription extends AbstractSpringModelModuleTypeDescription {

    @NotNull(message = "enum's fields must not be null!")
    @Valid
    private List<SpringModelModuleEnumTypeFieldDescription> fields;

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootEnumModelModuleGenerator.class;

    public List<SpringModelModuleEnumTypeFieldDescription> getFields() {
        return fields;
    }

    public void setFields(List<SpringModelModuleEnumTypeFieldDescription> fields) {
        this.fields = fields;
    }

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
