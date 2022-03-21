# Archery Scoring idea:

## Contents
* [Overview](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#overview)
* [My reasoning to create this project](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#my-reasoning-to-create-this-project)
* [How I expected the project to go](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#how-i-expected-the-project-to-go)
* [What went well](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#what-went-well)
* [What didn't go well](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#what-didnt-go-well)
* [How the project could be improved](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#how-the-project-could-be-improved)
* [The project](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#the-project)
* [External documentation](https://github.com/DylanPatel11/Archery-Scoring/blob/main/README.md#external-documentation)

## Overview
This project idea is based around my hobby Archery. It is an ongoing project which I started QA software development bootcamp in which I hope to develop into an application for future my archery sessions.

## My reasoning to create this project
The purpose of creating this project was to showcase the different software and technologies I have learnt throughout the course of the bootcamp.

Different technologies that were covered during bootcamp:

Integrated Development Environment: Intellij
Version Control System: Git
Source Code Management: GitHub
Kanban Board: Jira (Scrum Board)
Database Management System: H2, MySQL Server
Back-End Programming Language: Java
API Development Platform: Spring
Build Tool: Maven
Unit & Integration testing: JUnit, Mockito

I opted into this bootcamp after my time at university learning to code python, R and Latex I decided I wanted to develop my coding skills further to try and find a role within the industry.
The bootcamp has taught me a different language (Java) and exposed me to how a project is completed through scrum, git hub development pushes, along with front and back-end parts of an application.

## How I expected the project to go
Having done a bit of coding through my time doing mathematics at university I believed that I would be able to pick up coding in Java quite easy with a few challenges of understand what each reserved word does and how they are used.

## What went well
Coding each of the packages went smoothly with a few minor errors that have been changed and pushed to GitHub. In addition, the steps to creating the Spring application went well for me. I understood the problems I had when connecting to the H2 database and linking MySQL to my application as shown below:
![Local host](https://github.com/DylanPatel11/QA-Bootcamp-Archery-Project/blob/dev/Screenshots/Screenshot%20of%20localhost%20working%20and%20connecting%20to%20MySQL.jpg "H2 database link")


My perseverance to understand and push my project correctly although tough at the beginning feeling horrified that I lost all of my work. I have managed to complete a lot of work in the day that I lost 95% of my work. In addition, I understand now what went wrong and how to deal with this problem and the mistakes I made if I have this problem again.

## What didn't go well
Staring the project idea off and coming up with the idea to link back to archery, I was thinking about every little detail and should have thought about the idea being simple. Thus, when I was creating my entities, it felt like I had too many columns of data to input.
What I mean by this is for each session there are a lot of variables such as the different settings on a bow, the different arrow setups and different session environments etc. Thus, I decide to narrow down my variables. Another problem arose when naming my columns. For example, I wanted to date each session that was recorded but DATE is a reserved word in MySQL so I changed the column name to "dated" for now. In the future I will make the names of each column neater.
When trying to connect to the H2 database I could see that I had my Spring Boot application connecting with MySQL creating the table however I was unable to connect to the H2database through my browser. I was struggling to find the problem when I realised the java file in the entity package I named 'session.java'. "Session" is a reserved word also therefore I had to change my entity java file to "shoot.java".
Using Git hub in week 1 I understood creating a repo with different branches. However, with this project I was getting a bit confused as to why my files kept disappearing from my local machine of the files I had already pushed. it took me a few tries but I realised I needed to be in the Dev branch on GitBash creating the project then when I created a package, I would create a feature branch go back into eclipse create and edit the files to my liking, add them to my feature branch, push to my GitHub then do a pull request. My issue was I was creating the project all together then trying to push to different branches. I now understand to start in dev and any changes I make, make a feature branch with the changes, add, commit, push, create a pull request and then checkout to dev along with git pull.
This took me a while to understand thus have spent a lot of time trying to get my head around.

After completing each package and class and finally testing if it connects with postman I found towards the final few hours that my Spring application can’t be found by Postman therefore in the given time I couldn’t complete my testing part of the project.
I have checked each class with their respected java files and I can not seem to get the 404 error go away. Any idea as to why this is happening would be great to understand so I don’t run into this mistake again.

Below is the error screenshot in Postman:

![Postman not connecting](https://github.com/DylanPatel11/QA-Bootcamp-Archery-Project/blob/dev/Screenshots/Postman%20not%20connecting%20to%20Archery.jpg "Postman not connecting")



## How the project could be improved
Running out of time and loosing my work the day before submission I know given a bit more time, I could find out why postman could not connect to my API that I created. Therefore, I could run testing between Postman and my application. In addition, given the extra time I would run a Mockito test.
Having completed the testing part, I would have liked to have created a front end for a user to use.

The time I spend on this project after it’s intended submission, I will have a front-end application that can be accessed through different users and possibly roll out to people I know through Archery for them to use. 


## The project


## External documentation
All external documentation linked to this project can be found in the documentation folder in main branch. The link to my Jira board for this project is linked bellow.

[Jira Board](https://dylan-patel.atlassian.net/jira/software/projects/AP/boards/5 "Dylan's Archery Project Jira Board")
