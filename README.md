# bowlingscore

### CMD command line to run the unit tests:
...\bowlingscore> mvn test

### CMD command line to run the program:
mvn exec:java -Dexec.mainClass=com.bowling.bowlingscore.App -Dexec.args="1 4 4 5 6 4 5 5 10 0 0 1 7 3 6 4 10 0 2 8 6"
Als Parameter werden die Anzahl der Pins, die geschlagen wurden, eingegeben. <br />
z.B: <br />
1 4 im ersten Frame, <br />
4 5 im zweiten Frame, <br />
6 4 im dritten Frame mit Spare (4 (oder eine Nummer>4) wurde hinzugefügt, um 10 Pins zu erreichen beim zweiten Versuch im Frame) <br />
5 5 auch Spare <br />
10 0 im fünften Frame mit Strike ( 0 wurde eingegben als zweiter Parameter im Frame, weil es um einen Strike geht) <br />
ect. <br />
