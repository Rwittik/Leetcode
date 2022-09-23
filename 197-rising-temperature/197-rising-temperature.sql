# Write your MySQL query statement below
SELECT w2.id FROM WEATHER w2, WEATHER w1
WHERE w2.recordDate = DATE_ADD(w1.recordDate, INTERVAL 1 day)
AND w2.temperature > w1.temperature;