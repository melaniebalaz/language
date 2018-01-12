# ANTLR Beispiel

Um das Beispiel mit Maven zu verwalten können Sie auf folgende Befehle zurückgreifen:

## Generieren der Java Dateien aus den `.g4` Dateien (um damit in eine IDE arbeiten zu können)

    mvn antlr4:antlr4

## Übersetzen vom gesamten Projekt (übersetzt die `.g4` automatisch)

    mvn clean package

## Ausführen von `Calculator` (stell auch sicher dass alles korrekt übersetzt wurde)

    mvn -q clean package exec:java -Dexec.mainClass="Calculator"

## Ausführen von `AdvancedCalculator` (liest die Dateien `program1.txt` und `program2.txt` aus dem aktuellen Verzeichnis)

    mvn -q clean package exec:java -Dexec.mainClass="AdvancedCalculator"
