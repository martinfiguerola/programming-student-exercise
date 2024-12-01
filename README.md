# Courses Rest Api

A programming student wants to keep track of the topics he learned in different courses, so he can later include them in his resume.
To do this, he created a database called courses.
After creating the database, he began developing an application and modeled two classes:
Course and Topic, where a course can contain several topics.

### Database Schema
```
The course class has the following attributes:
* course_id
* name,
* modality
* end_date
* listOfTopics

The topic class has the following attributes:
* topic_id
* name
* description
```

### Features
From this, the student wants to develop an API that allows him to perform the following actions:
    
    1. Create a new course
    2. Create topics and associate them with a course
    3. Get all courses
    4. Get all topics for a given course
    5. Get all courses that contain the word “Java” as their name (may contain other words, for example, Introduction to Java, Advanced Java, Java for Beginners, etc.).
    6. Modify the data for a course
    7. Modify the data for a given topic

### Topics implemented
To implement each of the endpoints, consider the corresponding HTTP methods according to the action that needs to be carried out.
At the same time, consider the use of DTOs for the responses and all the good practices that you think can be applied.
Use JPA + Hibernate for the CRUD of data in a MySQL database.


