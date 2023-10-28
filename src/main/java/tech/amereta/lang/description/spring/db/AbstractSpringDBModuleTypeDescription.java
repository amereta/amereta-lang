package tech.amereta.lang.description.spring.db;

import com.fasterxml.jackson.annotation.JsonProperty;
import tech.amereta.lang.description.spring.SpringModuleTypeDescription;
import tech.amereta.lang.description.spring.db.type.SpringDBModuleType;

public abstract class AbstractSpringDBModuleTypeDescription implements SpringModuleTypeDescription {

    @JsonProperty("name")
    private SpringDBModuleType type;

    private String username = "username";

    private String password = "password";

    public SpringDBModuleType getType() {
        return type;
    }

    public void setType(SpringDBModuleType type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
