package tech.amereta.lang.description.spring.model.type.field;

public enum SpringDataType {

    JSON(""),
    STRING("String"),
    BOOLEAN("Boolean"),
    INTEGER("Integer"),
    LONG("Long"),
    FLOAT("Float"),
    DOUBLE("Double"),
    BIGDECIMAL("java.math.BigDecimal"),
    UUID("java.util.UUID"),
    ZONED_DATETIME("java.time.ZonedDateTime"),
    INSTANT("java.time.Instant");

    private final String dataType;

    SpringDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }
}
