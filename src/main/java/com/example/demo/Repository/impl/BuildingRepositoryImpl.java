package com.example.demo.Repository.impl;

import com.example.demo.Building;
import com.example.demo.Repository.BuildingRepository;
import com.example.demo.Repository.Entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
    static final String URL = "jdbc:mysql://localhost:3306/Building";
    static final String USER = "root";
    static final String PASS = "0335600047";
    @Override
    public List<BuildingEntity> building(String name) {
        List<BuildingEntity> result = new ArrayList<>();
        String query = "SELECT * FROM BuildDTO b WHERE b.name like '%" + name + "%'";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            // Lặp qua kết quả và hiển thị
            while (resultSet.next()) {
                BuildingEntity building = new BuildingEntity();
                building.setId(resultSet.getInt("id"));
                building.setTitle(resultSet.getString("name"));
                building.setAddress(resultSet.getString("address"));
                result.add(building);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Lỗi khi kết nối hoặc lấy dữ liệu: ", e);
        }
        return result;
    }


}
