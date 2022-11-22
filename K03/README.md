# Erarbeitung Begriffe

### Exceptions
Unter einer checked Exception versteht man eine Exception welche während dem compilen behandelt werden muss meistens wird diese durch einen Try-Catch Block behandelt. Ein Beispiel wäre dafür zB.  ``` NoSuchMethod```

Unter einer unchecked Exception versteht man eine Exception welche während dem laufen der Programms auftreten kann. Ein Beispiel wäre dafür zB.  ``` IndexOutOfBounds```

### throws
Dieses Statement kommt in die Signatur einer Methode. Dies heisst das diese Methode eine bestimmte oder eine allgemeine Exception schmeissen kann. So wird eine Exception weitergegeben bis sie von einem Exceptionhandler aufgefangen wird. 

### throw
Mit diesem Statement kann man selbst eine Exception schmeissen.

### try-catch-finally
Mit einem try-catch-finally Block behandelt man Exceptions in den ``` try{} ``` Block kommt ein Code Stück welches eine Exception schmeissen könnte. In den ``` catch{} ``` Block kommt Code welcher ausgeführt wird falls eine Exception im try geschmissen wird. Und zum schluss wird immer der ``` finally{} ``` Block ausgeführt.

