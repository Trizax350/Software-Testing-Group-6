package iit.uni.miskolc.hu.softwaretesting.service;


import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.ComplainAlreadyClosedException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;

import java.util.Collection;

public interface ManageComplainsInterface {

    void makeComplain(Complain complain) throws AlreadyExistsException;
    void updateComplain(Complain complain) throws NotFoundException;
    void deleteComplain(Complain complain) throws NotFoundException;
    void acceptComplain(Complain complain) throws ComplainAlreadyClosedException, NotFoundException;
    void rejectComplain(Complain complain) throws ComplainAlreadyClosedException, NotFoundException;
    Collection<Complain> getAllComplain();
    Collection<Complain> getAllComplainByRequest(int req_id);
    Collection<Complain> findComplainById(int id);

}
