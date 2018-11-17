package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import java.util.Collection;

public interface ComplainDAO {

    void createComplain(Complain complain);
    void modifyComplain(Complain complain);
    void removeComplain(Complain complain);
    Collection<Complain> getAllComplain();
    Collection<Complain> getAllComplainByRequest(int req_id);
    Collection<Complain> findComplainById(int id);

}
