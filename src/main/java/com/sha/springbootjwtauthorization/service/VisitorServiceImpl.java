package com.sha.springbootjwtauthorization.service;


import com.sha.springbootjwtauthorization.model.Visitor;
import com.sha.springbootjwtauthorization.repository.VisitorRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VisitorServiceImpl implements VisitorService{

    private final VisitorRepository visitorRepository;


    public VisitorServiceImpl(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;

    }



    @Override
    public Visitor saveVisitor(Visitor visitor)
    {
        visitor.setFirstName(visitor.getFirstName());
        visitor.setLastName(visitor.getLastName());
        visitor.setCompany(visitor.getCompany());
        visitor.setNumber(visitor.getNumber());
        visitor.setHost(visitor.getHost());
        visitor.setCreateTime(LocalDateTime.now());
        visitor.setSignOut(LocalDateTime.now());

        return visitorRepository.save(visitor);
    }

    @Override
    public Optional<Visitor> findByFirstName(String firstName)
    {
        return visitorRepository.findByFirstName(firstName);
    }

    @Override
    public List<Visitor> findAllVisitor()
    {
        return visitorRepository.findAll();
    }
}
