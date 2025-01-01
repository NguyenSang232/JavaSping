package com.example.demo.Service.impl;

import com.example.demo.Building;
import com.example.demo.Repository.BuildingRepository;
import com.example.demo.Repository.Entity.BuildingEntity;
import com.example.demo.Service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;
    @Override
    public List<Building> buildings(String name) {
        List<BuildingEntity> buildings = buildingRepository.building(name);
        List<Building> resultList = new ArrayList<>();
        for (BuildingEntity buildingEntity : buildings) {
            Building building = new Building();
            building.setId(buildingEntity.getId());
            building.setName(buildingEntity.getTitle());
            building.setAddress(buildingEntity.getAddress());
            resultList.add(building);
        }
        return resultList;
    }
}
