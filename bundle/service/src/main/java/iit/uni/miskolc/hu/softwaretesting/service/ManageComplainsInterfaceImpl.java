package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.dao.ComplainDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;

import java.util.Collection;

public class ManageComplainsInterfaceImpl implements ManageComplainsInterface {

    private ComplainDAO complainDAO;

    public ManageComplainsInterfaceImpl(ComplainDAO complainDAO) {
        this.complainDAO = complainDAO;
    }

    @Override
    public void makeComplain(Complain complain) {
        complainDAO.createComplain(complain);
    }

    @Override
    public void updateComplain(Complain complain) {
        complainDAO.modifyComplain(complain);
    }

    @Override
    public void deleteComplain(Complain complain) {
        complainDAO.removeComplain(complain);
    }

    @Override
    public Collection<Complain> getAllComplain() { return complainDAO.getAllComplain(); }

    @Override
    public Collection<Complain> getAllComplainByRequest(int req_id) { return complainDAO.getAllComplainByRequest(req_id); }

    @Override
    public Collection<Complain> findComplainById(int id) { return complainDAO.findComplainById(id); }
}
