# Patron Factory (Factory Method et Factory)

Auteur : Mangouo Jacky Victoire — INF461 / INF4067, Devoir 1 : Patrons de construction

- `src/factorymethod/probleme` : exemples de depart (construitDoc, Aboyeur)
- `src/factorymethod/cours` et `modifie` : Factory Method (3 puis 4 produits)
- `src/factory/cours` et `modifie` : Factory avec sous-classes (3 puis 4 produits)

## Compilation et execution
```
mkdir out
javac -d out $(find src -name "*.java")
java -cp out factorymethod.cours.Client
java -cp out factorymethod.modifie.Client
java -cp out factory.cours.Client
java -cp out factory.modifie.Client
java -cp out factorymethod.probleme.ConstructeurDocument
java -cp out factorymethod.probleme.TestAboyeur
```

## Diagrammes
Diagrammes de classes realises avec Dia (sources `.dia` et `.png` dans `diagrammes/`).
