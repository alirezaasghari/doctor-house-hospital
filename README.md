# doctor-house-hospital
## Bp1 - Doctor House Hospital #1 (Hospital Admission, Diagnose Room) 
The Hospital Admission is an app that receives Patients through the /patients endpoint. As soon as they arrive they get a patient number given and they are forwarded to the Diagnose Room. The Dr House will observe the Patient’s symptoms and figure out his illness and if he is unsure, he will quickly estimate that it must be lupus. Later on, after the 4 Bps are concluded, the Dr House will forward the Patient with his right diagnosis to the Nursery. 

## Bp2 - Doctor House Hospital #2 (Nursery - NoSQL MongoDB, Accountancy -JPA MySQL)
The Nursery app will have an endpoint called /patients and will receive them via post. A patient is expected to arrive with a patient number, a name, their list of symptoms and their diagnosed illness. Then the nurse will check their illness and provide the right treatment. Once that they have done this, the nurse will save this patient in their MongoDB database and finally forward the patient via post to the Accountancy app. The Accountancy app will receive the patient via post and for the given treatment, apply the specific costs, so that the accountant can create an invoice that the patient will have to pay in the future. The Accountancy app will store in its MySQL database the patients and also the invoices with the dateTime they were created, the costs for the treatment and the patient they belong to. The Accountancy app will also have an endpoint /invoices that will show all the invoices generated sorted by creation dateTime, so that in future Bps we will provide a user interface so the real accountant can see this in their computer.

## Bp3 - Doctor House Hospital #3 (Administration UI)
Provide an additional application called Administration that will have two web pages. One of them will be the index or home page under the “/” url, that will display a form so the patients can use it when they arrive to the hospital. In this page the patient can write his or her name and also the list of symptoms. When this form is submitted, the application will forward it to the Admission application. The second page will take care of the invoices and it will be found under the “/invoices” url. There we will be able to see a table showing all the invoices that were created by the Accountancy application. As an additional feature, the Administration application will have a menu at the top of its pages (created as a fragment and inserted in these two pages) that allows us to easily navigate from and to the “admission” and “invoices” pages. As an additional challenge, the use of webjars or libraries like Bootstrap, Materialize Css or JQuery could be considered.

## Bp4 - Doctor House Hospital #4 (Secure Administration UI with users and authorities)
Update the Administration application with the security package so that only the hospital accountant can access to the /invoices page. Providing a single user through in memory configuration is enough. Anyone who is not logged in that tries to access the /invoices page will be redirected to a login page that we will also provide. After logging in, the accountant can review all the invoices that have been generated. The accountant can also log out with one button. The admission page can be used by anyone without the need to be logged in.
