package Auto;

import validate.ValidateUtils;

public abstract class Driver {
    private String name;
    private Boolean driversLicense;
    private Integer experience;

    public Driver(String name, Boolean driversLicense, Integer experience) {
        this.name = ValidateUtils.validateString(name, "Не указано имя!");
        this.driversLicense = driversLicense;
        this.experience = ValidateUtils.validateInteger(experience, 3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(Boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    abstract String start();

    abstract String stop();

    abstract String refuel();
}
