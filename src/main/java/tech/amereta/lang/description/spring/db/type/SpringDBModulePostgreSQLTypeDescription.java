package tech.amereta.lang.description.spring.db.type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import tech.amereta.lang.description.spring.db.AbstractSpringDBModuleTypeDescription;

import java.lang.annotation.Annotation;

public final class SpringDBModulePostgreSQLTypeDescription extends AbstractSpringDBModuleTypeDescription {

    @JsonIgnore
    private Class<? extends Annotation> generator = SpringBootPostgreSQLDBModuleGenerator.class;

    @Override
    public Class<? extends Annotation> getGenerator() {
        return generator;
    }

    public void setGenerator(Class<? extends Annotation> generator) {
        this.generator = generator;
    }
}
