SELECT euni.unique_id, e.name FROM Employees e
Left join EmployeeUNI euni
ON e.id = euni.id;