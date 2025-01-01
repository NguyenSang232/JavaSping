package com.example.demo.Service;

import com.example.demo.Building;
import com.example.demo.Repository.Entity.BuildingEntity;

import java.util.List;

public interface BuildingService {
    List<Building> buildings(String name);
}
