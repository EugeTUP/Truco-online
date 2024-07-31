package com.example.src.services.imp;

import com.example.src.models.Dummy;
import com.example.src.repositories.DumRepository;
import com.example.src.services.DumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DumServiceImp implements DumService {

    @Autowired
    private DumRepository dummyRepository;

    @Override
    public Dummy getDummy(Long id) {
            return null;
    }

    @Override
    public List<Dummy> getAllDummy() {
        return null;
    }

    @Override
    public Dummy createDummy(Dummy dum) {
        return null;
    }

    @Override
    public Dummy updateDummy(Dummy dum) {
        return null;
    }

    @Override
    public void deleteDummy(Dummy dum) {

    }
}
