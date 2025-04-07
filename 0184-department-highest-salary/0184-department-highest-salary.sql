SELECT D.name AS Department, E.name AS Employee, E.salary AS Salary
FROM Employee E
JOIN Department D ON D.id = E.departmentId
JOIN (
    SELECT departmentId, MAX(salary) AS max_salary
    FROM Employee
    GROUP BY departmentId
) AS M ON E.departmentId = M.departmentId AND E.salary = M.max_salary;
