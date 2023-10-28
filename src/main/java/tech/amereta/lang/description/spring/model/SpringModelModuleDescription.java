package tech.amereta.lang.description.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import tech.amereta.lang.description.spring.AbstractSpringModuleDescription;
import tech.amereta.lang.description.spring.model.type.SpringModelModuleDomainTypeDescription;
import tech.amereta.lang.description.spring.model.type.SpringModelModuleEnumTypeDescription;

import java.lang.annotation.Annotation;
import java.util.LinkedList;
import java.util.List;

public final class SpringModelModuleDescription extends AbstractSpringModuleDescription {

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "type",
            visible = true
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = SpringModelModuleDomainTypeDescription.class, name = "DOMAIN"),
            @JsonSubTypes.Type(value = SpringModelModuleEnumTypeDescription.class, name = "ENUM"),
    })
    @Valid
    private List<AbstractSpringModelModuleTypeDescription> models = new LinkedList<>();

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootModelModuleGenerator.class;

    public List<AbstractSpringModelModuleTypeDescription> getModels() {
        return models;
    }

    public void setModels(List<AbstractSpringModelModuleTypeDescription> models) {
        this.models = models;
    }

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
