package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class ValidateUserTO implements Serializable {
    private Boolean validate;

    public Boolean getValidate() {
        return validate;
    }

    public void setValidate(Boolean validate) {
        this.validate = validate;
    }
}
