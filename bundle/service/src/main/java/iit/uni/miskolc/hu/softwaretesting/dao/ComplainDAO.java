package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.ComplainAlreadyClosedException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import java.util.Collection;

public interface ComplainDAO {

    void createComplain(Complain complain) throws AlreadyExistsException;
    void modifyComplain(Complain complain) throws NotFoundException;
    void removeComplain(Complain complain) throws NotFoundException;
    void acceptComplain(Complain complain) throws ComplainAlreadyClosedException, NotFoundException;
    void rejectComplain(Complain complain) throws ComplainAlreadyClosedException, NotFoundException;
    Collection<Complain> getAllComplain();
    Collection<Complain> getAllComplainByRequest(int req_id);
    Collection<Complain> findComplainById(int id);

}
