package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class CatalogTO implements Serializable {

    private static final long serialVersionUID = -8853482566070472169L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
