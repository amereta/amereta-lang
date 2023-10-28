package tech.amereta.lang.description.spring.model.type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tech.amereta.lang.description.spring.model.AbstractSpringModelModuleTypeDescription;
import tech.amereta.lang.description.spring.model.type.field.SpringDataType;
import tech.amereta.lang.description.spring.model.type.field.SpringModelModuleDomainTypeFieldDescription;
import tech.amereta.lang.util.DataTypeValidator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public final class SpringModelModuleDomainTypeDescription extends AbstractSpringModelModuleTypeDescription {

    @JsonProperty("id")
    @DataTypeValidator(values = {SpringDataType.UUID, SpringDataType.LONG})
    private SpringDataType idType = SpringDataType.UUID;

    private Boolean authenticable = false;

    private Boolean timestamped = false;

    @NotNull(message = "domain's fields must not be null!")
    @Valid
    private List<SpringModelModuleDomainTypeFieldDescription> fields = new ArrayList<>();

    @Valid
    private List<SpringModelModuleFieldRelationDescription> relations = new ArrayList<>();

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootDomainModelModuleGenerator.class;

    public SpringDataType getIdType() {
        return idType;
    }

    public void setIdType(SpringDataType idType) {
        this.idType = idType;
    }

    public Boolean getAuthenticable() {
        return authenticable;
    }

    public void setAuthenticable(Boolean authenticable) {
        this.authenticable = authenticable;
    }

    public Boolean getTimestamped() {
        return timestamped;
    }

    public void setTimestamped(Boolean timestamped) {
        this.timestamped = timestamped;
    }

    public List<SpringModelModuleDomainTypeFieldDescription> getFields() {
        return fields;
    }

    public void setFields(List<SpringModelModuleDomainTypeFieldDescription> fields) {
        this.fields = fields;
    }

    public List<SpringModelModuleFieldRelationDescription> getRelations() {
        return relations;
    }

    public void setRelations(List<SpringModelModuleFieldRelationDescription> relations) {
        this.relations = relations;
    }

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
