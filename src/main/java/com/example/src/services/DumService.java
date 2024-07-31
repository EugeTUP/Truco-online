package com.example.src.services;

import com.example.src.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DumService {

    Dummy getDummy(Long id);
    List<Dummy> getAllDummy();
    Dummy createDummy(Dummy dum);
    Dummy updateDummy(Dummy dum);
    void  deleteDummy(Dummy dum);

}
