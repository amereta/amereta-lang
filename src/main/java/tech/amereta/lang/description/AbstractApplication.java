package tech.amereta.lang.description;

import java.lang.annotation.Annotation;

public interface AbstractApplication {

    String getOwner();

    String getName();

    Class<? extends Annotation> getGenerator();

    Class<? extends Annotation> getValidator();
}
