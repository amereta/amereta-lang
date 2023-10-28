package tech.amereta.lang.description.spring.model.type.field;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

import java.util.LinkedList;
import java.util.List;

public final class SpringModelModuleDomainTypeFieldDescription {

    @NotNull(message = "domain field's name must not be null!")
    private String name;

    @NotNull(message = "domain field's dataType must not be null!")
    private SpringDataType dataType;

    private Object defaultValue;

    private List<String> genericTypes = new LinkedList<>();

    private List<String> modifiers = new LinkedList<>();

    private Integer length;

    @JsonProperty("transient")
    private boolean isTransient = false;

    @JsonIgnore
    private boolean primaryKey = false;

    private boolean unique = false;

    private boolean nullable = true;

    private boolean updatable = true;

    private boolean excludeFromJson = false;

    public String getName() {
        return name;
    }

    public static SpringModelModuleDomainTypeFieldDescription builder() {
        return new SpringModelModuleDomainTypeFieldDescription();
    }

    public SpringModelModuleDomainTypeFieldDescription name(String name) {
        setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpringDataType getDataType() {
        return dataType;
    }

    public SpringModelModuleDomainTypeFieldDescription dataType(SpringDataType dataType) {
        setDataType(dataType);
        return this;
    }

    public void setDataType(SpringDataType dataType) {
        this.dataType = dataType;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public SpringModelModuleDomainTypeFieldDescription defaultValue(Object defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public List<String> getGenericTypes() {
        return genericTypes;
    }

    public SpringModelModuleDomainTypeFieldDescription genericTypes(List<String> genericTypes) {
        setGenericTypes(genericTypes);
        return this;
    }

    public void setGenericTypes(List<String> genericTypes) {
        this.genericTypes = genericTypes;
    }

    public List<String> getModifiers() {
        return modifiers;
    }

    public SpringModelModuleDomainTypeFieldDescription modifiers(List<String> modifiers) {
        setModifiers(modifiers);
        return this;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    public Integer getLength() {
        return length;
    }

    public SpringModelModuleDomainTypeFieldDescription length(Integer length) {
        setLength(length);
        return this;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public boolean isTransient() {
        return isTransient;
    }

    public SpringModelModuleDomainTypeFieldDescription isTransient(boolean isTransient) {
        setTransient(isTransient);
        return this;
    }

    public void setTransient(boolean aTransient) {
        isTransient = aTransient;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public SpringModelModuleDomainTypeFieldDescription primaryKey(boolean primaryKey) {
        setPrimaryKey(primaryKey);
        return this;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isUnique() {
        return unique;
    }

    public SpringModelModuleDomainTypeFieldDescription unique(boolean unique) {
        setUnique(unique);
        return this;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public boolean isNullable() {
        return nullable;
    }

    public SpringModelModuleDomainTypeFieldDescription nullable(boolean nullable) {
        setNullable(nullable);
        return this;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public boolean isUpdatable() {
        return updatable;
    }

    public SpringModelModuleDomainTypeFieldDescription updatable(boolean updatable) {
        setUpdatable(updatable);
        return this;
    }

    public void setUpdatable(boolean updatable) {
        this.updatable = updatable;
    }

    public boolean isExcludeFromJson() {
        return excludeFromJson;
    }

    public SpringModelModuleDomainTypeFieldDescription excludeFromJson(boolean excludeFromJson) {
        setExcludeFromJson(excludeFromJson);
        return this;
    }

    public void setExcludeFromJson(boolean excludeFromJson) {
        this.excludeFromJson = excludeFromJson;
    }
}
