# Erarbeitung der Begriffe
### Encapsulation:
Unter Encapsulation versteht man die Idee Daten und Methoden zu Bündeln wie zB in einer Klasse in Java. Um von aussen nicht auf sie direkt zugreifen zu können.

### Information hiding:
Unter Information Hiding versteht man das schützen von dem Zustand oder der Repräsentation eines Objekts von aussen.

### Getter / Setter:
Unter Getter und Setter versteht man eine einfache Methode welche entweder den wert eines Objekts verändert oder den Wert eines Objekts zurück gibt.

### Delegation: 
Unter Delegation versteht man das weitergeben von bestimmten Aufgaben an eine Methode oder einen Klasse.

# Projekt / Umsetzung

    
    public void start(){
        userInterface();
    }
    
    public void userInterface(){
        System.out.println("Was wollen Sie tun?" +
                "(1) Bitcoinpreis abfragen" +
                "(2) Bitcoinpreis setzen");
        System.out.print("Eingabe: ");
    }
    
 Hier wurde eine Delegation verwendet um die Ausgabe des UI auszulagern
