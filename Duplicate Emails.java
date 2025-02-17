select email as Email
from    Person
group by email
having count(1)>1




-- Write your PostgreSQL query statement below.

SELECT email 
FROM Person
GROUP BY email
HAVING count(email) > 1;




SELECT DISTINCT p2.email as Email 
FROM Person p1
JOIN Person p2
ON p1.id<>p2.id AND p1.email=p2.email;
