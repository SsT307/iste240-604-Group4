# ISTE240-604-Group4

```
** GROUP MEMBERS: **
    Shaikha Alhajri 418008663
    Fatma Alsuwaidi 406004792
    Fatma Almadani 421009269
    Tania Aziz 418005117

```

_MedPro: Patient Record Management System_

#### PROJECT OVERVIEW:
Java-based website that is designed to organize patient's records/profiles in
a structured and centralized system. It aims to reduce the fragmentation of medical data
by allowing healthcare providers to access a patient's medical data from a single,
secure source.
MedPro's application will focus on clarity, consistency, and accessibility. We will use
intuitive navigation, clean layouts, and role-based dashboards to ensure users only see/access
information relevant to them.

~ ~ ~ ~ ~
#### ASSIGNMENT 1:
We are required to use GitHub to share this project and configure the project repository.
Each group member must add their details individually using the basic Git commands: git clone, git pull,
git add, git commit -m "", and git push. The project also reuqires creating an "index.html" file that serves as a simple landing page.
Lasty, entities will be added to the project as Spring Beans using the "@Component" annotation. Each bean must
contain attributes with their getters and setters.
Overall, this assignment will help us not only practice using Git commands, but also allow us to start collaborating
with each other and implement concepts we learnt in class.
[[We considered using embeddables for shared attributes but chose to wait for implementation until we gain further 
knowledge from future classes.]]

~ ~ ~ ~ ~
#### ASSIGNMENT 2:
This assignment required us to build upon our previous assignment using Spring Boot. We served dynamic web pages
using the Mustache template.
Each member should now contribute their work using their own branch: using git branch, git checkout, and git merge.
The project requires a Service class, as well as a Controller Class. A simulated DB is created in the Service class to 
store hardcoded lists of entity objects. The GET and POST requests are then handled by the Controller class to return the correct 
views. 
Each entity must belong to 2 mustache template pages, one to view and one to add data. We are also required to link at 
least 2 entities together [[We linked 4 entites; Appointments & Patient | Hospital & Medical Record ]]. 
This assignment builds on our understanding of backend applications and dynamic views.

~ ~ ~ ~ ~
#### ASSIGNMENT 3 | PhaseII:
This phase required us to migrate from Mustache templates to a full REST API architecture. 
Each member implemented their own JPA entity classes, repositories, services, and REST controllers 
for their assigned entities. The backend now uses MySQL as a persistent database, with Spring Data JPA 
handling all database operations. The frontend was rebuilt using standalone HTML/CSS/JavaScript pages 
with Bootstrap 5 for responsiveness, consuming the REST APIs via fetch() and jQuery. Each entity page 
supports full CRUD operations including search functionality. Database seeding was implemented via 
data.sql to populate initial records on startup.

**Entity Division:**
- Shaikha Alhajri : Patient, Appointment
- Tania Aziz : Hospital, Medical Record
- Fatma Almadani : Insurance
- Fatma Alsuwaidi : Doctor

**Merge Manager:** Shaikha Alhajri
