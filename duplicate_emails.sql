SELECT DISTINCT(p1.email) as Email
FROM person AS p1, person AS p2
WHERE p1.email=p2.email && p1.id<>p2.id;

SELECT email
FROM person
GROUP BY email
HAVING count(email)>1;
