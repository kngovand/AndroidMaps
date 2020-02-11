# androidMapsProject
 
*Campus Event Apps by: Kevin Ngovanduc, Hamza Khokhar*    
 
	Objective:     
The objective of this Campus Event app was to inform current MSU Denver students about activities that would take place on Auraria Campus. The app would start on a log on screen, where the database would correspond to the current students registered at MSU. From the login screen, students would have to register through the Firebase database and create a new user account, where the app would direct them to the maps home page. From there, users would have a map view and two buttons, Activity List and Create Event. These buttons would allow students to either view, edit, or delete activities.  
 
	Features:   
● App launch splash screen   
● Login and Registration functional with Firebase cloud storage   
● Home page: Maps activity with the ability to view and create new events through forms   
● Events are shown as ‘cards’, which contains information such as the location through static map API, date, time, etc.    
● Uses Google Maps API to find user current location   
● Using inputted address to retrieve geolocation (uses static map API)   
● Uses shake sensor to delete unwanted cards    
 
	APIs used:    
● Google maps API   
● Static map API   
● Firebase Cloud storage   
 
	Key classes: 
Login screen (Login.kt)   
● Complete with login screen for username email and hidden password textbox   
● Utilizes Firebase to store and retrieve user credentials ● Login uses intent to navigate to Registration or Maps Activity
● Implemented Dialog Box to show progress of login (pass/fail)   
● Input validation for username email and password    
● Register button - uses intent to launch Registration.kt if clicked   
● Login button - authorize passed values ‘name’ and ‘pwd’ and if the task is successful, will launch MapsActivity.kt with an intent   

Registration (Registration.kt)   
● Functionality is similar to Login.kt, but registers a new entity in the Firebase database   
● Utilizes Firebase storage to create user   
● Input validation for username email and password   
● Return button - uses onClickListener to navigate back to Login.kt with an intent   
● Save button - creates a new user in the database with createUserWithEmailAndPassword function   
● If the registration was successful, uses an intent that launches Login.kt   
 
Maps Activity (MapsActivity.kt)   
● Shows map with user’s current location and has ActivityList button and CreateEvent button. Showcases the usage of Google maps functionality   
● Utilizes Google Maps API for the map view   
● Maps - called as fragment, shows user location with the use of LOCATION_FINE   
● When Activity List is selected, the user will be able to view specific information about an event on campus. This information would include: activity name/type, date, start/end time, and the address where the event would take place. The Activity list holds a ‘card’ for each event created and would show the location on the map. The user also has the option to delete cards as well   
● Create Event works similarly to Activity List, where it asks the user to input all of the information required to create an activity    

	Issues encountered:    
● The static maps API was extremely difficult to code with, we ended up trying to use resources from the internet but they were also scarce.     
● Progress bar in the Login and Registration classes had a bug and was forcing the app to crash. It has currently been commented out and we are trying to debug the code.      
● Unknown crash when launching the app, we were able to fix the problem by editing the manifest.xml by altering the permissions. 
 
	Potential improvements:     
● We were considering implementing an administrative login, where only the admins can delete cards and edit them as well. They would also be able to access student accounts.      
● Using geofence for markers, so that when a user approaches a marker, they will be updated with a notification even if the application is closed.      
● More forms, categories, and better organization.     
● Create a web application that talks to same database.
