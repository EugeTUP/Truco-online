package com.example.src.controllers;

import com.example.src.dtos.DumDto;
import com.example.src.models.Dummy;
import com.example.src.services.DumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @Autowired
    private DumService dummyService;

    @GetMapping("")
    public ResponseEntity<DumDto> getDummys(){
        List<Dummy> dummyList = dummyService.getAllDummy();

        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<DumDto> getDummy(@PathVariable Long id){
       Dummy dum = dummyService.getDummy(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<DumDto> createDummy(DumDto dto){
        Dummy dum = dummyService.createDummy(null);
        return null;
    }
    @PutMapping("")
    public ResponseEntity<DumDto> updateDummy(DumDto dto){
        Dummy dum = dummyService.updateDummy(null);

        return null;
    }
    @DeleteMapping("")
    public ResponseEntity<DumDto> deleteDummy(DumDto dto){

        dummyService.deleteDummy(null);
        return null;
    }
}
