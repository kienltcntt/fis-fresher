package org.example;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface IEmployeeDAO {
    public List<Employee> getAll();

    public boolean add(Employee employee);

}
