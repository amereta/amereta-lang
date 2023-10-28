package tech.amereta.lang.description.spring.model.type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import tech.amereta.lang.description.spring.model.type.field.SpringDataType;

public final class SpringModelModuleFieldRelationDescription {

    @NotNull(message = "domain's relation type must not be null!")
    private SpringRelation relationType;

    @NotNull(message = "domain's relation side must not be null!")
    private String to;

    private Boolean join = false;

    @JsonIgnore
    private SpringDataType joinDataType;

    public static SpringModelModuleFieldRelationDescription builder() {
        return new SpringModelModuleFieldRelationDescription();
    }

    public SpringRelation getRelationType() {
        return relationType;
    }

    public SpringModelModuleFieldRelationDescription relationType(SpringRelation relationType) {
        setRelationType(relationType);
        return this;
    }

    public void setRelationType(SpringRelation relationType) {
        this.relationType = relationType;
    }

    public String getTo() {
        return to;
    }

    public SpringModelModuleFieldRelationDescription to(String to) {
        setTo(to);
        return this;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Boolean getJoin() {
        return join;
    }

    public SpringModelModuleFieldRelationDescription join(Boolean join) {
        setJoin(join);
        return this;
    }

    public void setJoin(Boolean join) {
        this.join = join;
    }

    public SpringDataType getJoinDataType() {
        return joinDataType;
    }

    public SpringModelModuleFieldRelationDescription joinDataType(SpringDataType joinDataType) {
        setJoinDataType(joinDataType);
        return this;
    }

    public void setJoinDataType(SpringDataType joinDataType) {
        this.joinDataType = joinDataType;
    }
}
