package bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.service;


import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.model.Complain;

import java.util.Collection;

public interface ManageComplainsInterface {

    void makeComplain(Complain complain);
    void updateComplain(Complain complain);
    void deleteComplain(Complain complain);
    Collection<Complain> getAllComplain();
    Collection<Complain> getAllComplainByRequest(int req_id);
    Collection<Complain> findComplainById(int id);

}
