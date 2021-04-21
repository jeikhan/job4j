# JeiTracker 1.3 &middot; ![version](https://img.shields.io/badge/release-beta-yellow) [![GitHub license](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/jeikhan/job4j/blob/hotfix_3/LICENSE)  [![Build Status](https://travis-ci.com/jeikhan/job4j.svg?branch=hotfix_3)](https://travis-ci.com/jeikhan/job4j) [![codecov](https://codecov.io/gh/jeikhan/job4j/branch/hotfix_3/graph/badge.svg?token=WUPRSSWI6Y)](https://codecov.io/gh/jeikhan/job4j)

JeiTracker is a console application, built in the Java language, that can store data with key "Name - ID" in its database.

The app contains the following features:

- **Add data:** The user enters the name of the data, and the program assigns it a unique ID.
- **Edit the existing data with a new one by ID:** The user enters the ID of the existing data, then enters the name of the new data, which replaces the existing one with its unique ID.
- **Delete data by ID:** The user enters the data ID and the program deletes it.
- **Show a list of all data:** When you select this menu point, the program displays a list of all data.
- **Search data by name:** The program displays all data by the entered name in the search field.
- **Search data by ID:** The program displays the data by the entered ID in the search field.

## Stack

`Java 13` &middot; `JUnit 4.13.1` &middot; `Hamcrest 2.2` &middot; `Travis CI` &middot; `JaCoCo` &middot; `Apache Maven 3.6.2` &middot; `CheckStyle`

<!-- Example badge
[![Java](https://img.shields.io/badge/-Java_13-F60102?style=flat&logo=java&logoColor=white)](https://www.oracle.com/java/technologies/javase-downloads.html)
-->

## Guide

### Download and Install

- For the program to work, you need [JRE(Java Runtime Environment)](https://ru.wikipedia.org/wiki/Java_Runtime_Environment):
  - Go to the [java.com](https://www.java.com/ru/download/manual.jsp)
  - Download and install the JRE package for your operating system
- Download the [Latest release (.zip)](https://github.com/jeikhan/job4j/releases/tag/v.1.3-beta)

### Run

- Go to folder [`tracker`](https://github.com/jeikhan/job4j/tree/hotfix_3/chapter_002/src/main/java/ru/job4j/tracker)

```
job4j
└── chapter_002
    └── src
        └── main/java/ru/job4j
            └── tracker
```
- Press `Shift + Right Mouse Button` anywhere in the folder window and select the _"Open command window here"_ option from the context menu
- Type in command prompt `java -jar StartUI.jar` and press `Enter`

### Demo

![Console App](https://i.ibb.co/DbZczCw/console-app.png)

## ToDo

- [x] Implement actions when selecting menu items.
- [ ] Implement sort data.

## License

The JeiTracker is open-sourced software licensed under the [MIT licensed](./LICENSE).

## P.S.

Please, write all suggestions and comments in **[Issues](https://github.com/jeikhan/job4j/issues)**. Thanks!