# LeverX-course
## Task1 "Starting Java project using command line"
---
### To run this application you need to follow the instructions below:
1. Download project to your computer.
2. Go to the project directory using command line. For instance, use "cd path\LeverX-course".
3. Use "javac -d bin src/ru/leverx/task1/*.java" to compile all classes from project. "-d bin" sets the destination directory (bin) for class files.
4. Use "java -cp bin ru.leverx.task1.PersonGreeting" to run this application. "-cp bin" means classpath for class files (in our case this is bin directory). "ru.leverx.task1.PersonGreeting" is the main class.
---
### To create and run JAR-file you need to follow the instructions below:
1. Download project to your computer.
2. Go to the project directory using command line. For instance, use "cd path\LeverX-course".
3. Use "javac -d bin src/ru/leverx/task1/*.java" to compile all classes from project. "-d bin" sets the destination directory (bin) for class files.
4. Build the programm using "jar -cmf manifest.mf person-greeting.jar -C bin .". After "-cmf" we specify the path to the manifest file. After "-C" we specify the path to compiled files. "." in the end means path where the jar file will be placed.In our case, this is the main directory.
5. Use "java -jar person-greeting.jar" to run jar file. "-jar" means that the Jar file is running.
