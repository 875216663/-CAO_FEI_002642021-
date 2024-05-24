# Description

This project is a task manager that allows users to manage their tasks efficiently. Users can log in with a username and password on the starting page, although password validation is not implemented. Instead, the system checks if the username meets certain criteria. Once logged in, each user has their own task list.

Tasks can be added using the "Add Task" button, and their status can be viewed in the task list. Users can edit tasks by clicking on them, and they can also delete tasks. Clicking on the "Done" button on the left side marks a task as completed. Tasks in the task list are sorted by time. Additionally, users can search for specific tasks by their name.



# Getting Started

To get started with this project, follow these steps:

* Clone the repository to your local machine.
* Navigate to the project directory.
* Install dependencies with npm install.
* Build the project with npm run build.
* Start the server with npm start.

## Frontend
The frontend of this project is built using Vite and React.

## Backend
The backend of this project is built using Express.

## Usage
- Users can log in with a username on the starting page. After logging in, they can add tasks using the "Add Task" button. Tasks can be edited, deleted, or marked as done. The task list is sorted by time, and users can search for specific tasks by name.



## Visual Requirements
- Provide at least basic visual styling to provide distinct areas for different parts of the application and sufficient visual spacing



# Security
## Authentication
* Users must undergo an authentication step, although actual passwords are not checked. Authentication denial occurs under certain conditions, such as banning a specific username. The server responds with a token or session ID for client authentication/authorization.
