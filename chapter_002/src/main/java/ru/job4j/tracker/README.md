# JeiTracker &middot; ![version](https://img.shields.io/badge/version-1.4.2-blue) ![release](https://img.shields.io/badge/release-LTS-brightgreen) [![GitHub license](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/jeikhan/job4j/blob/hotfix_3/LICENSE)

JeiTracker is a console application, built in the Java language, that can store data with key "**Name - ID**" temporarily (**without database**).

The app contains the following features:

- **Add data:** The user enters the name of the data, and the program assigns it a unique ID.
- **Edit the existing data with a new one by ID:** The user enters the ID of the existing data, then enters the name of the new data, which replaces the existing one with its unique ID.
- **Delete data by ID:** The user enters the data ID and the program deletes it.
- **Show a list of all data:** When you select this menu point, the program displays a list of all data.
- **Search data by name:** The program displays all data by the entered name in the search field.
- **Search data by ID:** The program displays the data by the entered ID in the search field.

## Stack

`Java_13` &bull; `JUnit_4.13.1` &bull; `Hamcrest_2.2` &bull; `Travis_CI` &bull; `JaCoCo` &bull; `Codecov` &bull; `Apache_Maven_3.6.2` &bull; `CheckStyle`

<!-- Example badge
[![Java](https://img.shields.io/badge/-Java_13-F60102?style=flat&logo=java&logoColor=white)](https://www.oracle.com/java/technologies/javase-downloads.html)

![version](https://img.shields.io/badge/release-beta-yellow)
-->

## Guide

### Download and Install

1. For the program to work, you need [**JRE**](https://ru.wikipedia.org/wiki/Java_Runtime_Environment "Java Runtime Environment"):
    - Go to the [**java.com**](https://www.java.com/ru/download/manual.jsp)...
    - Download and install the JRE package for your operating system...
2. Download the [**latest release**](https://github.com/jeikhan/job4j/releases) of **JeiTracker**.

> Notes: 
> - asset `jeitracker.jar` is one executable file of program JeiTracker (Windows / Linux);
> - asset `Source_code.zip` contains all source code of repository (Windows);
> - asset `Source_code.tar.gz` contains all source code of repository (Linux).

### Run

#### jeitracker.jar

1. Go to your **download folder**...
2. Press `Shift + Right Mouse Button` anywhere in the folder window and select the _"Open command window here"_ option from the context menu...
3. Type in command prompt `java -jar jeitracker.jar` and press `Enter`.

#### Source code.zip

1. Unzip with windows **zip-tool** or [**7zip**](https://www.7-zip.org/) tool...
2. Go to...

```
job4j/chapter_002/src/main/java/ru/job4j/tracker/build_app
```

3. Press `Shift + Right Mouse Button` anywhere in the folder **build_app** and select the _"Open command window here"_ option from the context menu...
4. Type in command prompt `java -jar jeitracker.jar` and press `Enter`.

#### Source code.tar.gz

> Warning! Recommended for Linux

1. Unzip with command `tar xvzf name_archive.tar.gz` in terminal...
2. Go to... 

```
job4j/chapter_002/src/main/java/ru/job4j/tracker
```

3. Press `Right Mouse Button` on the folder **build_app** and select the _"Open in terminal"_ option from the context menu...
4. Type in terminal command `java -jar jeitracker.jar` and press `Enter`.

### Demo

> Coming soon...

## ToDo

- [x] Implement date and time in menu.
- [x] Implement actions when selecting menu items.
- [ ] Implement sort data.

## License

The JeiTracker is open-sourced software licensed under the [MIT licensed](https://github.com/jeikhan/job4j/blob/hotfix_3/LICENSE).

## P.S.

Please, write all suggestions and comments in **[Issues](https://github.com/jeikhan/job4j/issues)**. Thanks!