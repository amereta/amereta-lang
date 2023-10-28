package tech.amereta.lang.description;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import tech.amereta.lang.description.spring.SpringBootApplicationDescription;

public class ApplicationDescriptionWrapper {

    private ApplicationType applicationType;

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "applicationType"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = SpringBootApplicationDescription.class, name = "SPRING_BOOT")
    })
    @Valid
    private AbstractApplication application;

    public ApplicationType getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType;
    }

    public AbstractApplication getApplication() {
        return application;
    }

    public void setApplication(AbstractApplication application) {
        this.application = application;
    }
}
