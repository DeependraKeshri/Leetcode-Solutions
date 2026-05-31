# Write your MySQL query statement below
UPDATE Salary
SET sex = REPLACE(
            REPLACE(
                REPLACE(sex, 'm', '#'),
            'f', 'm'),
        '#', 'f');