package com.example.demo.Repository;

import com.example.demo.Repository.Entity.BuildingEntity;
import java.util.ArrayList;
import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> building(String name);
}
