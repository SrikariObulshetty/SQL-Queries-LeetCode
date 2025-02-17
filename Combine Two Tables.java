SELECT Person.firstName,Person.lastName,Address.city,Address.state
FROM Person
LEFT JOIN 
Address
ON Person.personId=Address.personId;



SELECT firstName,lastName,city,state
FROM Person as p
LEFT JOIN 
Address as a 
ON p.personId=a.personId;
