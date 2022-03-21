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

## My reasoning to create this project



## How I expected the project to go


## What went well



## What didn't go well
When creating my entities I realsied to start the idea off I was thinking about every little detail and should have thought about the idea being simple. What I mean by this is for each session there are alot of variables such as the differernt settings on a bow, the different arrow setups and different session environments ect. Thus I decide to narrow down my variables. Another problem arose when naming my columns. For example I wanted to date each session that was recorded but DATE is a reserved word in MySQL so I changed the column name to "dated" for now. In the future I will make the names of each column neater.
When trying to connect to the H2 database I could see that I had my SpringBoot application connecting with MySQL creating the table however I was unable to connect to the H2database through my browser. I was struggling to find the problem when I realised the java file in the entity package I named 'session.java'. "Session" is a reserved word also therefore I had to change my entity java file to "shoot.java".
Using Git hub in week 1 I understood creating a repo with different branches. However whith this project I was getting a bit confused as to why my files kept disapearing from my local machine of the files I had alread pushed. it took me a few tries but I realised I needed to be in the Dev branch on Gitbash creating the project then when I created a package I would create a feature branch go back into eclipse create and edit the files to my liking, add them to my feauture branch, push to my GitHub then do a pull request. My issue was I was creating the project all together then trying to push to different branches. I now understand to start in dev and any changes I make make a feature branch with the changes, add, commit, push, create a pull request and then checkout to dev along with git pull.
This took me a while to understand thus have spent alot of time trying to get my head around.

## How the project could be improved



## The project


## External documentation
All external documentation linked to this project can be found in the documentation folder in main branch. The link to my Jira board for this project is linked bellow.

[Jira Board](https://dylan-patel.atlassian.net/jira/software/projects/AP/boards/5 "Dylan's Archery Project Jira Board")
