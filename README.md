# HibernateServlet
This project is mead to understand how Hibernate works along with Object Relation Mapping, HQL, HCQL, MVC architecture, version control, etc. 
Dev view initially shows 5 rows in JSON format so that we can understand how data come from DB. 
The Admin account can do various operations. (View and Controller are not written yet All the Models are written)

In my project, I separate the model into 3 sections Helper, Dao, DaoImpl. Every controller calls "Helper" and the helper is responsible to communicate with Dao and get back a response to the controller. 

I made a custom exception class named DbException. If there is any problem with connection or DB operation then it throws DbException.

Each Dao Interface extends BaseDao Interface. BaseDao comprises a basic Db operation methods definition.

There is a class named DbSession which has two static methods which will give session instance after starting a transaction and commit the transaction and close the session.
