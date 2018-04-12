package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.HouseDevice;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class HouseDeviceDaoImpl extends AbstractDao<HouseDevice> implements HouseDeviceDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<HouseDevice> getEntityClass() {
        return HouseDevice.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}
