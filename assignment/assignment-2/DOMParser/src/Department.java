/**
 * Created by 张文玘 on 2017/4/16.
 */
public class Department {
    private int depId;
    private String depType;
    private String depName;
    private Address depAddress;


    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepType() {
        return depType;
    }

    public void setDepType(String depType) {
        this.depType = depType;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Address getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(Address depAddress) {
        this.depAddress = depAddress;
    }
}
