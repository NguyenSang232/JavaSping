package com.example.demo;
import com.example.demo.Service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BuildingService buildingService;
    @GetMapping(value = "/api/building/")
    public List<Building> getBuilding(@RequestParam(name="name") String name){
        List<Building> buildings = buildingService.buildings(name);
        return buildings;
    }
//    private JdbcTemplate jdbcTemplate;
//    public Controller(JdbcTemplate jdbcTemplate1) {
//        this.jdbcTemplate = jdbcTemplate1;
//    }
//    @GetMapping("test")
//    public String test(){
//        String sql = "CREATE TABLE IF NOT EXISTS test_table (" +
//                "name VARCHAR(25) PRIMARY KEY)";
//        jdbcTemplate.execute(sql);
//        return "Create Sucessful";
//    }
    // code focus on MVC help code can get it easily
    //Presentation Layer ==> Controller (View, Model, Controller)
    //Business Logic Layer ==> @Service (handle output data depends on Requirement of Client)
    //Data Access Layer ==> @Repository ==> Repository Class

}
