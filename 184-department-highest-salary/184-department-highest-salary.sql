# Write your MySQL query statement below
SELECT dept.Name AS Department, Employee.Name AS Employee, Salary
FROM Employee

INNER JOIN Department AS dept ON Employee.DepartmentId=dept.Id

where (dept.Id, Salary) IN (SELECT DepartmentId, max(Salary)
                         FROM Employee GROUP BY DepartmentId);