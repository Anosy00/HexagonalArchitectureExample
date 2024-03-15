# Exemple d'une architecture hexagonale

Pour pouvoir réaliser cette exemple, nous nous sommes basés sur le schéma suivant : 

![image](https://github.com/Anosy00/HexagonalArchitectureExample/assets/75740384/8cd58fba-df4b-4c0a-aaa0-628acbd69c7c)


Diagramme UML de l'application : 

- **StockManager** : correspond à la classe `domaine` de notre application
- **StorageService** : correspond à un `port` de notre application
- **DummyStorageService** : correspond à la classe `adaptateur` de notre application
- **Main** : correspond à la classe pour réaliser des tests de notre application


![image](https://github.com/Anosy00/HexagonalArchitectureExample/assets/75740384/074f5937-2ee6-4d6a-8b63-ac3a68f8173e)
