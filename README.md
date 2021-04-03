# JeiTracker &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/jeikhan/job4j/blob/hotfix_3/LICENSE) [![Java](https://img.shields.io/badge/Java-v13-blue)](https://www.oracle.com/java/technologies/javase-downloads.html) [![Build Status](https://travis-ci.com/jeikhan/job4j.svg?branch=hotfix_3)](https://travis-ci.com/jeikhan/job4j) [![codecov](https://codecov.io/gh/jeikhan/job4j/branch/hotfix_3/graph/badge.svg?token=WUPRSSWI6Y)](https://codecov.io/gh/jeikhan/job4j) ![status](https://img.shields.io/badge/status-development-red)

JeiTracker is a console application, built in the Java language, that can store data with key "Name - ID" in its database.

The app contains the following features:

- **Add data:** The user enters the name of the data, and the program assigns it a unique ID.
- **Edit the existing data with a new one by ID:** The user enters the ID of the existing data, then enters the name of the new data, which replaces the existing one with its unique ID.
- **Delete data by ID:** The user enters the data ID and the program deletes it.
- **Show a list of all data:** When you select this menu point, the program displays a list of all data.
- **Search data by name:** The program displays all data by the entered name in the search field.
- **Search data by ID:** The program displays the data by the entered ID in the search field.

## Getting started guide

### Installation

- For the program to work, you need [JRE](https://ru.wikipedia.org/wiki/Java_Runtime_Environment):
  - Go to the [java.com](https://www.java.com/ru/download/manual.jsp) ...
  - Download and install the JRE package for your operating system ...
- Clone (HTTPS): ``` git clone https://github.com/jeikhan/job4j.git ``` .

### Usage

- Go to folder ``` tracker ``` ...

```
job4j
└── chapter_002
    └── src
        └── main/java/ru/job4j
            └── tracker
```
- The press ``` Shift + right click mouse ``` button anywhere in the folder window and select the _"Open command window here"_ option from the context menu ...
- Type ``` java -jar StartUI.jar ``` and press ``` Enter ```

### Demo

![Console App](https://i.ibb.co/DbZczCw/console-app.png)

## ToDo &middot; ![GitHub last commit](https://img.shields.io/github/last-commit/jeikhan/job4j)

- [x] Implement actions when selecting menu items.
- [ ] Implement sort data.
- [ ] Optimize algorithm.

## Contacts &middot; [![GitHub issues](https://img.shields.io/github/issues/jeikhan/job4j)](https://github.com/jeikhan/job4j/issues)

:email: evgenii.kapaev@yandex.ru

## License

The JeiTracker is open-sourced software licensed under the [MIT licensed](./LICENSE).
