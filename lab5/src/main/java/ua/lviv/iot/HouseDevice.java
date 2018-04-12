package ua.lviv.iot;

import javax.persistence.*;

@Entity
public class HouseDevice {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "house_device_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private DeviceType type;

    @Column(name = "producer")
    private String producer;

    @Column(name = "power")
    private Integer power;

    @Column(name = "is_switched")
    private boolean isSwitched = false;

    public HouseDevice() {

    }

    public HouseDevice(final Integer id, final String name, final String producer, final int power, final DeviceType deviceType) {
        super();
        this.name = name;
        type = deviceType;
        this.producer = producer;
        this.power = power;
        this.id = id;
    }

    public final DeviceType getType() {
        return type;
    }

    public final String getProducer() {
        return producer;
    }

    public final void setProducer(final String producer) {
        this.producer = producer;
    }

    public final Integer getPower() {
        return power;
    }

    public final void setPower(final Integer power) {
        this.power = power;
    }

    public final boolean getSwitched() {
        return isSwitched;
    }

    public final void switchOff() {
        this.isSwitched = false;
    }

    public final void switchOn() {
        this.isSwitched = true;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String toString() {
        return type + " " + producer + " " + name + " " + power;
    }

    public String getHeaders() {
        return "Name,Type,Producer,Power,Is Switched";
    }

    public String toCSV() {
        return name + "," + type + "," + producer + "," + power + "," + isSwitched;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
