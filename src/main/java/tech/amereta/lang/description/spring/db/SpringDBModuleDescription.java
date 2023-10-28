package tech.amereta.lang.description.spring.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import tech.amereta.lang.description.spring.AbstractSpringModuleDescription;
import tech.amereta.lang.description.spring.db.type.SpringDBModuleMySQLTypeDescription;
import tech.amereta.lang.description.spring.db.type.SpringDBModulePostgreSQLTypeDescription;

import java.lang.annotation.Annotation;

public final class SpringDBModuleDescription extends AbstractSpringModuleDescription {

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "name",
            visible = true
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = SpringDBModuleMySQLTypeDescription.class, name = "MYSQL"),
            @JsonSubTypes.Type(value = SpringDBModulePostgreSQLTypeDescription.class, name = "POSTGRESQL"),
    })
    @Valid
    private AbstractSpringDBModuleTypeDescription db;

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootDBModuleGenerator.class;

    public AbstractSpringDBModuleTypeDescription getDb() {
        return db;
    }

    public void setDb(AbstractSpringDBModuleTypeDescription db) {
        this.db = db;
    }

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
